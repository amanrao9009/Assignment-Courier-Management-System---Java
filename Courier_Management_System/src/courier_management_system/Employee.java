/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courier_management_system;

/**
 *
 * @author ASUS
 */
public class Employee {
    
    private int employeeID;
    private String employeeName;
    private String email;
    private String contactNumber;
    private String role;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeID, String employeeName, String email, String contactNumber, String role, double salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.role = role;
        this.salary = salary;
    }

    // Single Getter for Full Details
    public Employee getEmployeeDetails() {
        return this;
    }

    // Single Setter for Full Details
    public void setEmployeeDetails(Employee employee) {
        // Assuming that you want to update all details at once
        this.employeeID = employee.employeeID;
        this.employeeName = employee.employeeName;
        this.email = employee.email;
        this.contactNumber = employee.contactNumber;
        this.role = employee.role;
        this.salary = employee.salary;
    }
    
    
    
}
