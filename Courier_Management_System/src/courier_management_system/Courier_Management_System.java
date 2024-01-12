/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package courier_management_system;
import java.sql.*;
/**
 *
 * @author ASUS
 */






public class Courier_Management_System {
    

    public Connection con;
    
    
    

    public static void main(String[] args) {
      
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/courie_management","root","root");
            
            if(con!=null){
                System.out.println("Conneted succesfully");
            }   
            
            String empNo;
            Statement stmt;
            ResultSet rs;
            
            stmt = con.createStatement();  
            rs = stmt.executeQuery("SELECT Status FROM `courie_management`.`courier`");
          
            
            while (rs.next()) {              
             empNo = rs.getString(1);             
             System.out.println("Employee number = " + empNo);
                                  
            

            }
            
   

            
        }    
        catch(Exception e){
            System.out.println(e);
            System.out.println("not conneted");
        }
        
       
        ICourierUserService ic = new ICourierUserService();
        
        
       Courier newRow = ic.placeOrder();
        System.out.println(newRow.senderName);
    }
    
}
