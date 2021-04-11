/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;


import Business.Role.Role;


/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
   
    private Role role;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    


    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }



    public void setRole(Role role) {
        this.role = role;
    }





    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}