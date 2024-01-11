/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courier_management_system;

/**
 *
 * @author ASUS
 */
public class User {
    private int userID;
    private String userName;
    private String email;
    private String password;
    private String contactNumber;
    private String address;

    // Default Constructor
    public User() {
    }
    
    public void goodI(){
        
        System.out.println("afds");
    }

    // Parametrized Constructor
    public User(int userID, String userName, String email, String password, String contactNumber, String address) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    // Getters and Setters
    // ...

    // toString() method
    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
