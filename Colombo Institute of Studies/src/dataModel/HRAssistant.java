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
public class HRAssistant extends Employee {

    public HRAssistant(String empName, int empEPF, String empDepartment, String empDesignation, String password, String userType, String address, int age, String gender, String email) {
        super(empName, empEPF, empDepartment, empDesignation, password, userType, address, age, gender, email);
    }

    public HRAssistant() {
    }

    //Polymorphism (Method Overriding)
    public String salaryCalculation() {
        int salary = 25000;
        int transportAllowance = 5000;
        int foodAllowence = 1000;
        int increment = 5000;
        int total = salary + transportAllowance + foodAllowence + increment;
        String message = "The Total Salary for HR Assistant is " + Integer.toString(total);
        return message;
    }

}
