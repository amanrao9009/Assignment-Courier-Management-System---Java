/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courier_management_system;
import java.util.Date;
/**
 *
 * @author ASUS
 */
public class Payment {
    private long paymentID;
    private long courierID;
    private double amount;
    private Date paymentDate;

    public Payment() {
    }

    public Payment(long paymentID, long courierID, double amount, Date paymentDate) {
        this.paymentID = paymentID;
        this.courierID = courierID;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    // Single Getter for Full Details
    public Payment getPaymentDetails() {
        return this;
    }

    // Single Setter for Full Details
    public void setPaymentDetails(Payment payment) {
        // Assuming that you want to update all details at once
        this.paymentID = payment.paymentID;
        this.courierID = payment.courierID;
        this.amount = payment.amount;
        this.paymentDate = payment.paymentDate;
    }
    
}
