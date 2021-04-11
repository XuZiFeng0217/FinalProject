/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Company.Company;
import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Product;
import Business.Restaurant.Restaurant;
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
    //1.待接单 2.已接单待配送 3.在仓库中 4.已出库在运输 5.已完成 6.已拒绝订单 7订单运输失败 8请求入库中 9请求出库中 10 拒绝入库
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
