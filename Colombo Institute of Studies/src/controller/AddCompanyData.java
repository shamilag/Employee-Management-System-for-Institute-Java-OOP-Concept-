/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
//Child class for Abstract Class
public class AddCompanyData extends ManageCompanyData {

    Connection con = null;
    PreparedStatement pst = null;

    @Override
    public void addNewDepartment(String depName) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String s = "INSERT INTO  depart (department)VALUES(?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/addparties", "root", "");
            pst = con.prepareStatement(s);
            pst.setString(1, depName);
            pst.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @Override
    public void addNewDesignation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
