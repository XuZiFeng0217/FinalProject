/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Company.Company;
import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.UserAccount.UserAccount;
import Business.Vehicle.Vehicle;
import Bussiness.Warehouse.WareHouse;
import java.util.List;
import java.util.Map;

/**
 *
 * @author zzz
 */
public class Order {
    
   
    private DeliveryMan deliveryMan;
    private List<Map<Vehicle,Integer>> vehicles;
    private UserAccount customer;
    private double total;
    /*
    1.wait for accepting the order
    2.accepted and wait for delivering
    3.in warehouse
    4. out of storage and be transported
    5.finished
    6.refuse the order
    7.Order shipping failure
    8.Request for storage
    9.Request out of storage
    10.Refuse storage
    */
    
    private int status;
    private String comment;
    private Company company;
    private String address;
    private WareHouse wareHouse;

    public WareHouse getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }
    
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }


    
    

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Map<Vehicle, Integer>> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Map<Vehicle, Integer>> vehicles) {
        this.vehicles = vehicles;
    }
    
    


    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.getVehicles().toString();
    }
    
    
    
    
    
    
    
}
