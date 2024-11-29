/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dataModel.HRAssistant;
import dataModel.HRManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.AdminDashboardUI;
import view.AdminLoginUI;
import view.RegisterHRView;

/**
 *
 * @author HP
 */
public class ManageHRUsers {

    Connection con = null;
    PreparedStatement pst = null;

    //Register (SELECT)
    //Polymorphism (Overloading) : With return type With Parameters
    public boolean manageEmployee(String empName, int empEPF, String empDepartment, String empDesignation, String password, String userType, String address, int age, String gender, String email) {
        if (userType.equals("HR Assistant")) {
            HRAssistant hrAssistantObj = new HRAssistant(empName, empEPF, empDepartment, empDesignation, password, userType, address, age, gender, email);
        } else {
            HRManager hrManagerObj = new HRManager(empName, empEPF, empDepartment, empDesignation, password, userType, address, age, gender, email);
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String query = "INSERT INTO `hr`( `name`, `address`, `age`, `gender`, `email`, `password`, `epf`, `usertype`, `designation`, `department`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/addparties", "root", "");
            pst = con.prepareStatement(query);
            pst.setString(1, empName);
            pst.setString(2, address);
            pst.setInt(3, age);
            pst.setString(4, gender);
            pst.setString(5, email);
            pst.setString(6, password);
            pst.setInt(7, empEPF);
            pst.setString(8, userType);
            pst.setString(9, empDesignation);
            pst.setString(10, empDepartment);
            pst.executeUpdate();

            if (userType.equals("HR Assistant")) {
                HRAssistant assistantObj = new HRAssistant();
                System.out.println(assistantObj.salaryCalculation());
                JOptionPane.showMessageDialog(null, "REGISTER SUCCESSFULLY\n" + assistantObj.salaryCalculation());
            } else {
                HRManager managerObj = new HRManager();
                System.out.println(managerObj.salaryCalculation());
                JOptionPane.showMessageDialog(null, "REGISTER SUCCESSFULLY\n" + managerObj.salaryCalculation());
            }

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterHRView.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Polymorphism (Overloading) : With return type With Parameters Delete
    public boolean manageEmployee(int id) {
        System.out.println();
        // Delete 
        return true;
    }
}
