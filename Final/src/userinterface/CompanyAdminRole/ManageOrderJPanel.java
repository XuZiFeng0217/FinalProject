/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CompanyAdminRole;

import Business.Company.Company;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Order.Order;
import Bussiness.Warehouse.WareHouse;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zzz
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrderJPanel
     */
    List<Order> allOrders;
    private JPanel userProcessContainer;
    Company company;
    EcoSystem ecosystem;
    public ManageOrderJPanel(JPanel userProcessContainer, Company company, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = business;
        this.company = company;
        allOrders = ecosystem.getOrderDirectory();
        populateTable(allOrders);
        popupatCombo();
        popupatCombo1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblOrganizationList = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        lblOrganizationList1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Detail", "TotalPrice", "Customer", "Address", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(160);
        }

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Accept");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Decline");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblOrganizationList.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrganizationList.setText("DekiverMan List:");

        btnBack1.setText("<< Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        lblOrganizationList1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrganizationList1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOrganizationList1.setText("WareHouseList:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOrganizationList1)
                            .addComponent(lblOrganizationList))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton1)))
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)))
                .addGap(211, 211, 211))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jComboBox1, jComboBox2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblOrganizationList, lblOrganizationList1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOrganizationList, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblOrganizationList1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Order order = (Order) jTable1.getValueAt(selectedRowIndex, 0);
        List<DeliveryMan> manList = ecosystem.getDeliveryManDirectory().getDeliveryManList();
        for(DeliveryMan deliveryMan : manList){
            if(deliveryMan.getFirstName().equals(jComboBox1.getSelectedItem())){
                order.setDeliveryMan(deliveryMan);
                order.setStatus(2);
                deliveryMan.getOrders().add(order);
               
            }
        }
        
        List<WareHouse> wareHouses = ecosystem.getWareHouseDirectory();
        for(WareHouse wareHouse : wareHouses){
            if(wareHouse.getName().equals(jComboBox2.getSelectedItem())){
                order.setWareHouse(wareHouse);
                System.out.println(order.getWareHouse().getName());
            }
        }
        populateTable(allOrders);
        JOptionPane.showMessageDialog(null, "You have accepted an order successfully!", "Warning", JOptionPane.WARNING_MESSAGE);
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Order order = (Order) jTable1.getValueAt(selectedRowIndex, 0);
       
        order.setStatus(6);
        JOptionPane.showMessageDialog(null, "You have declined an order successfully!", "Warning", JOptionPane.WARNING_MESSAGE);
        populateTable(allOrders);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblOrganizationList;
    private javax.swing.JLabel lblOrganizationList1;
    // End of variables declaration//GEN-END:variables

    private void populateTable(List<Order> allOrders) {
        List<Order> thisOrders = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(Order order:allOrders){
            if(order.getCompany().getName().equals(company.getName())){
                
                thisOrders.add(order);
            }}
        model.setRowCount(0);
        for (Order order1 : thisOrders){
            String status = null;
            if(order1.getStatus()==1) status = "Awaiting Response";
            if(order1.getStatus()==2) status = "Awaiting Delivery";
            if(order1.getStatus()==3) status = "In The WareHouse";
            if(order1.getStatus()==4) status = "In Transit";
            if(order1.getStatus()==5) status = "Completed";
            if(order1.getStatus()==6) status = "Declined";
            if(order1.getStatus()==8) status = "Pending Enter";
            Object[] row = new Object[5];
            row[0] = order1;
            row[1] = order1.getTotal();
            row[2] = order1.getCustomer().getUsername();
            row[3] = order1.getAddress();
            row[4] = status;
            model.addRow(row);
            
        }
  
    }
    
    private void popupatCombo(){
        List<DeliveryMan> deliveryMans = ecosystem.getDeliveryManDirectory().getDeliveryManList();
        jComboBox1.removeAllItems();
        for(DeliveryMan deliveryMan : deliveryMans){
            jComboBox1.addItem(deliveryMan.getFirstName());
        }
        
        
    }

    private void popupatCombo1() {
        List<WareHouse> wareHouses = ecosystem.getWareHouseDirectory();
        jComboBox2.removeAllItems();
        for(WareHouse wareHouse:wareHouses){
            jComboBox2.addItem(wareHouse.getName());
        }
    }
}
