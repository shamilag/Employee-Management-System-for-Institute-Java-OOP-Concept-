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
public class Employee {

    private String empName;
    private int empEPF;
    private String empDepartment;
    private String empDesignation;
    private String password;
    private String userType;
    private String address;
    private int age;
    private String gender;
    private String email;
    
    public Employee() {
    }

    public Employee(String empName, int empEPF, String empDepartment, String empDesignation, String password, String userType, String address, int age, String gender, String email) {
        this.empName = empName;
        this.empEPF = empEPF;
        this.empDepartment = empDepartment;
        this.empDesignation = empDesignation;
        this.password = password;
        this.userType = userType;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }
    
    //Polymorphism (Method Overriding)
    public String salaryCalculation(){
        String message = "The Basic Salary for Employee is 25000 LKR";
        return message;
    } 
    
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpEPF() {
        return empEPF;
    }

    public void setEmpEPF(int empEPF) {
        this.empEPF = empEPF;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
