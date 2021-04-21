package Business;

import Business.Company.Company;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;

import Business.Order.Order;
import Business.Problem.Problem;

import Business.Role.AdminDataRole;
import Business.Role.CompanyAdminRole;
import Business.Role.CompanyDataRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.ServiceRole;
import Business.Role.SystemAdminRole;
import Business.Role.WareHouseAdminRole;
import Business.Role.WareHouseDataRole;
import Business.UserAccount.UserAccount;
import Business.Vehicle.Vehicle;
import Bussiness.Warehouse.WareHouse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
       
        List<Order> orders = new ArrayList<>();
        system.setOrderDirectory(orders);
        
        
        //set administrator account
       
        UserAccount uaAdmin = system.getUserAccountDirectory().createUserAccount("a1", "123", new SystemAdminRole());
        
        //set customer account
        UserAccount uaCustomer1 = system.getUserAccountDirectory().createUserAccount("c1", "123", new CustomerRole());
        UserAccount uaCustomer2 = system.getUserAccountDirectory().createUserAccount("c2", "123", new CustomerRole());
        
       
        
        UserAccount company1 = system.getUserAccountDirectory().createUserAccount("SF", "123", new CompanyAdminRole());
        UserAccount company2 = system.getUserAccountDirectory().createUserAccount("EXPRESS", "123", new CompanyAdminRole());
        UserAccount company3 = system.getUserAccountDirectory().createUserAccount("UPS", "123", new CompanyAdminRole());
        
        //set deliverman account
        UserAccount delivery1 = system.getUserAccountDirectory().createUserAccount("d1", "123", new DeliverManRole());
        UserAccount delivery2 = system.getUserAccountDirectory().createUserAccount("d2", "123", new DeliverManRole());
        UserAccount delivery3 = system.getUserAccountDirectory().createUserAccount("d3", "123", new DeliverManRole());
        
        //set storekeeper account
        UserAccount wha = system.getUserAccountDirectory().createUserAccount("wh1", "123", new WareHouseAdminRole());
        UserAccount whb = system.getUserAccountDirectory().createUserAccount("wh2", "123", new WareHouseAdminRole());
        UserAccount whc = system.getUserAccountDirectory().createUserAccount("wh3", "123", new WareHouseAdminRole());
      
        //set Customer service account
        UserAccount s1 = system.getUserAccountDirectory().createUserAccount("s1", "123", new ServiceRole());
        
        
        //set Company Data Administrator account
        UserAccount cd1 = system.getUserAccountDirectory().createUserAccount("cd1", "123", new CompanyDataRole());
        UserAccount cd2 = system.getUserAccountDirectory().createUserAccount("cd2", "123", new CompanyDataRole());
        UserAccount cd3 = system.getUserAccountDirectory().createUserAccount("cd3", "123", new CompanyDataRole());
       
       
        //Initialize the system data administrator
        UserAccount ad1 = system.getUserAccountDirectory().createUserAccount("ad1", "123", new AdminDataRole());
        
        //Initialize the warehouse data manager
        UserAccount wd1 = system.getUserAccountDirectory().createUserAccount("wd1", "123", new WareHouseDataRole());
        UserAccount wd2 = system.getUserAccountDirectory().createUserAccount("wd2", "123", new WareHouseDataRole());
        UserAccount wd3 = system.getUserAccountDirectory().createUserAccount("wd3", "123", new WareHouseDataRole());
        
        //Initialize the Customer data
        Customer c1 = new Customer(1,"Jack","Smith");
        Customer c2 = new Customer(2,"Lily","Frank");
        Customer c3 = new Customer(3,"John","Hopkins");
        uaCustomer1.setAddress("Hanjiang Road");
        CustomerDirectory customers = new CustomerDirectory();
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customers.setCustomerList(customerList);
        system.setCustomerDirectory(customers);
        
        //Initialize Deliveryman data
        DeliveryMan man1 = new DeliveryMan(1,"d1","");
        DeliveryMan man2 = new DeliveryMan(2,"d2","");
        DeliveryMan man3 = new DeliveryMan(3,"d3","");
        DeliveryManDirectory deliveryManDirectory = new DeliveryManDirectory();
        List<DeliveryMan> deliveryManList = new ArrayList<DeliveryMan>();
        List<Order> ordersDelivery = new ArrayList<>();
        man1.setOrders(ordersDelivery);
        man2.setOrders(ordersDelivery);
        man3.setOrders(ordersDelivery);
        deliveryManList.add(man1);
        deliveryManList.add(man2);
        deliveryManList.add(man3);
        deliveryManDirectory.setDeliveryManList(deliveryManList);
        system.setDeliveryManDirectory(deliveryManDirectory);
        

        
        uaAdmin.setRole(new SystemAdminRole());
        uaCustomer1.setRole(new CustomerRole());
        uaCustomer2.setRole(new CustomerRole());
       
        delivery1.setRole(new DeliverManRole());
        
        
        //Initialize Company
        List<Company> companyList = new ArrayList<>();
        Company com1 = new Company("SF");
        Company com2 = new Company("EXPRESS");
        Company com3 = new Company("UPS");
        companyList.add(com1);
        companyList.add(com2);
        companyList.add(com3);
        system.setCompanyDirectory(companyList);
        
        //Initialize car information
        Vehicle v1 = new Vehicle("Small",100.0,1.0);
        Vehicle v2 = new Vehicle("Medium",300.0,5.0);
        Vehicle v3 = new Vehicle("Large",500.0,12.0);
        List<Vehicle> VehicleList = new ArrayList<>();
        VehicleList.add(v1);
        VehicleList.add(v2);
        VehicleList.add(v3);
        com1.setVehicleList(VehicleList);
        com2.setVehicleList(VehicleList);
        com3.setVehicleList(VehicleList);
        
        //Initialize Transit warehouse
        WareHouse wh1 = new WareHouse("wh1");
        WareHouse wh2 = new WareHouse("wh2");
        WareHouse wh3 = new WareHouse("wh3");
        List<WareHouse> WareHouses = new ArrayList<>();
        WareHouses.add(wh1);
        WareHouses.add(wh2);
        WareHouses.add(wh3);
        system.setWareHouseDirectory(WareHouses);
        
        //Initialize problem
        List<Problem> problems = new ArrayList<>();
        system.setProblemDirectory(problems);
        return system;
    }
    
}
