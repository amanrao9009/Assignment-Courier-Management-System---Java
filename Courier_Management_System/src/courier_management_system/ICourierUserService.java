/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courier_management_system;

import java.util.*;
import java.text.*;
import java.time.*;

/**
 *
 * @author ASUS
 */
public  class ICourierUserService {
    
     Scanner scanner = new Scanner(System.in);
 // Static variable to generate unique tracking numbers
    private static int nextTrackingNumber = 1;

    public Courier placeOrder() {
        int trackingNumber = generateTrackingNumber();
        
         int courierID = trackingNumber;
        System.out.print("Enter sender name: ");
        String senderName = scanner.nextLine();

        System.out.print("Enter sender address: ");
        String senderAddress = scanner.nextLine();

        System.out.print("Enter receiver name: ");
        String receiverName = scanner.nextLine();

        System.out.print("Enter receiver address: ");
        String receiverAddress = scanner.nextLine();

        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();

        // Consume the newline character left by nextDouble() before calling nextLine()
        scanner.nextLine();

        System.out.print("Enter status: ");
        String status = scanner.nextLine();

        // Assuming userId is an integer
        System.out.print("Enter userId: ");
        int userId = scanner.nextInt();

        // Assuming deliveryDate is a Date object
        System.out.print("Enter delivery date (yyyy-MM-dd): ");
        String deliveryDateString = scanner.next();
         LocalDate dummyLocalDate = LocalDate.of(2000, 1, 1);
        Date deliveryDate = Date.from(dummyLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        
//         try {
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            Date parsedDate = dateFormat.parse(deliveryDateString);
//
//            deliveryDate = parsedDate;
//        } catch (ParseException e) {
//            System.out.println("Error parsing date: " + e.getMessage());
//        }
//        
        
         
        // Implement common logic for placing an order, such as validation
        // Additional logic can be delegated to concrete implementations
        
       Courier courier = new Courier( 
         courierID,
        senderName,
        senderAddress,
        receiverName,
        receiverAddress,
        weight,
        status,
        trackingNumber,
        deliveryDate,
        userId);
       
       System.out.print(courier.getCourierDetails().senderAddress);
        
        
        
        return courier;
    }

//    public String getOrderStatus(String trackingNumber) {
//        // Implement common logic for getting order status
//        // Additional logic can be delegated to concrete implementations
//        return specificGetOrderStatusLogic(trackingNumber);
//    }
//
//    public boolean cancelOrder(String trackingNumber) {
//        // Implement common logic for canceling an order
//        // Additional logic can be delegated to concrete implementations
//        return specificCancelOrderLogic(trackingNumber);
//    }

    private int generateTrackingNumber() {
        return nextTrackingNumber++;
    }

    // Abstract methods to be implemented by concrete subclasses
//    protected abstract void specificPlaceOrderLogic(Courier courierObj);
//
//    protected abstract String specificGetOrderStatusLogic(String trackingNumber);
//
//    protected abstract boolean specificCancelOrderLogic(String trackingNumber);    

  
}
