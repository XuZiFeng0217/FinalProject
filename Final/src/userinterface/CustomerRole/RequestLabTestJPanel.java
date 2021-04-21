/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Organization;
import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    EcoSystem ecosystem;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestLabTestJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        populateTable();
       
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        List<Order> allOrders = ecosystem.getOrderDirectory();
        List<Order> newOrders = new ArrayList<>();
        for(Order order : allOrders){
            if(order.getCustomer()==userAccount&&order.getStatus()==5){
                newOrders.add(order);
            }
        }

        for (Order order : newOrders){
            String status = null;
            if(order.getStatus()==1) status = "Awaiting Response";
            if(order.getStatus()==2) status = "Awaiting Delivery";
            if(order.getStatus()==3) status = "In The WareHouse";
            if(order.getStatus()==4) status = "In Transit";
            if(order.getStatus()==5) status = "Completed";
            if(order.getStatus()==6) status = "Declined";
            if(order.getStatus()==8) status = "Pending Enter";
            if(order.getStatus()==9) status = "Pending Out";
            if(order.getStatus()==10) status = "Enter Denied";
            Object[] row = new Object[5];
            row[0] = order;
            row[1] = order.getCompany().getName();
            row[2] = order.getTotal();
            row[3] = status;
            row[4] = order.getComment();
            
            model.addRow(row);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 206, 163));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(250, 70, 75));
        requestTestJButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Submit the Comment");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Detail", "Company", "TotalPrice", "Status", "Comments"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 460, 190));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 460, 30));

        backJButton.setBackground(new java.awt.Color(60, 117, 255));
        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Order order = (Order)jTable1.getValueAt(selectedRowIndex, 0);
        order.setComment(jTextField1.getText());
        JOptionPane.showMessageDialog(null, "Success", "Warning", JOptionPane.WARNING_MESSAGE);
        populateTable();

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        //        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}
