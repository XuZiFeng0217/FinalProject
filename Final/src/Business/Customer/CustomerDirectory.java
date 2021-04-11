/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.List;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    List<Customer> customerList;

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public void addCutomer(Customer customer){
        this.customerList.add(customer);
    }
    
    public void removeCutomer(Customer customer){
        this.customerList.remove(customer);
    }
    
}
