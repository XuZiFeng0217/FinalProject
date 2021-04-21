/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Company;

import Business.Vehicle.Vehicle;
import java.util.List;

/**
 *
 * @author zzz
 */
public class Company {
    //Define company information
    
    private String name;
    List<Vehicle> vehicleList;

    public Company(String name) {
        this.name = name;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
    
    
    
    
}
