/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Company.Company;
import Business.Company.CompanyDirectory;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Order.Order;
import Business.Problem.Problem;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Bussiness.Warehouse.WareHouse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private List<Order> orderDirectory;
    private List<Company> companyDirectory;
    private List<WareHouse> wareHouseDirectory;
    private List<Problem> problemDirectory;
    public EcoSystem(CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory,List<Order> orderDirectory,List<Company> companyDirectory,List<WareHouse> wareHouseDirectory,List<Problem> problemDirectory) {

        
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.orderDirectory = orderDirectory;
        this.companyDirectory = companyDirectory;
        this.wareHouseDirectory = wareHouseDirectory;
        this.problemDirectory = problemDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
      
    }
    
    public boolean checkIfUserIsUnique(String userName){
      
       return false;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }



    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public List<Order> getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(List<Order> orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public List<Company> getCompanyDirectory() {
        return companyDirectory;
    }

    public void setCompanyDirectory(List<Company> companyDirectory) {
        this.companyDirectory = companyDirectory;
    }

    public List<WareHouse> getWareHouseDirectory() {
        return wareHouseDirectory;
    }

    public void setWareHouseDirectory(List<WareHouse> wareHouseDirectory) {
        this.wareHouseDirectory = wareHouseDirectory;
    }

    public List<Problem> getProblemDirectory() {
        return problemDirectory;
    }

    public void setProblemDirectory(List<Problem> problemDirectory) {
        this.problemDirectory = problemDirectory;
    }
    
    
    
    
    
    
    
    
    
    
}
