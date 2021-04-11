/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author zzz
 */
public class Product {
    private int id;
    private String name;
    private String detail;
    private Double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(int id, String name, String detail, Double price) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
    }
    public Product() {

    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
    
}
