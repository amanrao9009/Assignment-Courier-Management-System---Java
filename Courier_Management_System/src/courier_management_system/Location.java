/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courier_management_system;

/**
 *
 * @author ASUS
 */
public class Location {
  
    private int locationID;
    private String locationName;
    private String address;

    public Location() {
    }

    public Location(int locationID, String locationName, String address) {
        this.locationID = locationID;
        this.locationName = locationName;
        this.address = address;
    }

    // Single Getter for Full Details
    public Location getLocationDetails() {
        return this;
    }

    // Single Setter for Full Details
    public void setLocationDetails(Location location) {
        // Assuming that you want to update all details at once
        this.locationID = location.locationID;
        this.locationName = location.locationName;
        this.address = location.address;
    }
    
}
