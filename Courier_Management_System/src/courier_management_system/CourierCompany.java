/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courier_management_system;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class CourierCompany {

    private String companyName;
    private List<Courier> courierDetails;
    private List<Employee> employeeDetails;
    private List<Location> locationDetails;

    public CourierCompany() {
    }

    public CourierCompany(String companyName, List<Courier> courierDetails, List<Employee> employeeDetails, List<Location> locationDetails) {
        this.companyName = companyName;
        this.courierDetails = courierDetails;
        this.employeeDetails = employeeDetails;
        this.locationDetails = locationDetails;
    }

    // Single Getter for Full Details
    public CourierCompany getCourierCompanyDetails() {
        return this;
    }

    // Single Setter for Full Details
    public void setCourierCompanyDetails(CourierCompany courierCompany) {
        // Assuming that you want to update all details at once
        this.companyName = courierCompany.companyName;
        this.courierDetails = courierCompany.courierDetails;
        this.employeeDetails = courierCompany.employeeDetails;
        this.locationDetails = courierCompany.locationDetails;
    }    
    
}
