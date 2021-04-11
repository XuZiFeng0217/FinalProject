/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness.Warehouse;

import Business.Order.Order;
import java.util.List;

/**
 *
 * @author zzz
 */
public class WareHouse {
    private String name;
    List<Order> orders;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public WareHouse(String name) {
        this.name = name;
    }
    
    
    
    
    
}
