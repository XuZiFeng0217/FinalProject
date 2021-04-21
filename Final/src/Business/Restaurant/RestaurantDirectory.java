/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.List;


public class RestaurantDirectory {
    List<Restaurant> restaurantList;

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public void add(Restaurant restaurant){
        this.restaurantList.add(restaurant);
    }
    
    public void remove(Restaurant restaurant){
        this.restaurantList.remove(restaurant);
    }
    
    
}
