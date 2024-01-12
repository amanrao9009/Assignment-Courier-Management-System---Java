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
public class Courier {
    public Courier(){};
    public Courier(int courierID1, String senderName1, String senderAddress1, String receiverName1, String receiverAddress1, double weight1, String status1, int trackingNumber1, Date deliveryDate1, int userId1) {
    }
    
    public int courierID;
    public String senderName;
    public String senderAddress;
    public String receiverName;
    public String receiverAddress;
    public double weight;
    public String status;
    public String trackingNumber;
    public Date deliveryDate;
    public int userId;

    public Courier getCourierDetails() {
        Courier detailsCopy = new Courier();
        detailsCopy.courierID = this.courierID;
        detailsCopy.senderName = this.senderName;
        detailsCopy.senderAddress = this.senderAddress;
        detailsCopy.receiverName = this.receiverName;
        detailsCopy.receiverAddress = this.receiverAddress;
        detailsCopy.weight = this.weight;
        detailsCopy.status = this.status;
        detailsCopy.trackingNumber = this.trackingNumber;
        detailsCopy.deliveryDate = this.deliveryDate;
        detailsCopy.userId = this.userId;

        return detailsCopy;
    }

    public void setCourierDetails(int courierID, String senderName, String senderAddress,
        String receiverName, String receiverAddress, double weight, String status,
        String trackingNumber, Date deliveryDate, int userId) {

        this.courierID = courierID;
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
        this.weight = weight;
        this.status = status;
        this.trackingNumber = trackingNumber;
        this.deliveryDate = deliveryDate;
        this.userId = userId;
    }
    
    
}
