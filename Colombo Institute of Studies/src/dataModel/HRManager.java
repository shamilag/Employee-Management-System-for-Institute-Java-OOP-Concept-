/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataModel;

/**
 *
 * @author HP
 */
public class HRManager extends Employee {

    public HRManager(String empName, int empEPF, String empDepartment, String empDesignation, String password, String userType, String address, int age, String gender, String email) {
        super(empName, empEPF, empDepartment, empDesignation, password, userType, address, age, gender, email);
    }

    public HRManager() {
    }

    //Polymorphism (Method Overriding)
    public String salaryCalculation() {
        int salary = 25000;
        int transportAllowance = 5000;
        int foodAllowence = 1000;
        int increment = 15000;
        int total = salary + transportAllowance + foodAllowence + increment;
        String message = "The Total Salary for HR Manager is " + Integer.toString(total);
        return message;
    }
}
