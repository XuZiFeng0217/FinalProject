/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vehicle;

/**
 *
 * @author zzz
 */
public class Vehicle {
    private String name;
    private double price;
    private double size;

    public Vehicle(String name, double price, double size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public Vehicle() {
    }
    
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
    
    
    
}
