/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.List;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private List<DeliveryMan> deliveryManList;

    public List<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(List<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    public void removeDeliveryMan(DeliveryMan deliveryMan){
        this.deliveryManList.remove(deliveryMan);
    }
    public void addDeliveryManDirectory(DeliveryMan deliveryMan){
        this.deliveryManList.add(deliveryMan);
    }
    
}
