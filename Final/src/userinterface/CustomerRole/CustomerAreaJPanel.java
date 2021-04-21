/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Company.Company;
import Business.EcoSystem;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import Business.Vehicle.Vehicle;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    EcoSystem ecosystem;
    List<Map<Vehicle,Integer>> cast;
    Order order;
    double totalPrice  = 0;
    
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        cast = new ArrayList<>();
        
        
        
        populateCombo();
        populateCombo1();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
        model.setRowCount(0);
        List<Vehicle> vehicles = new ArrayList<>();
        List<Company> companys =  ecosystem.getCompanyDirectory();
        for(int i=0;i<companys.size();i++){
            if(companys.get(i).getName().equals(jComboBox1.getSelectedItem())){
                vehicles = companys.get(i).getVehicleList();
        }
        }
        for (Vehicle vehicle : vehicles){
            Object[] row = new Object[3];
            row[0] = vehicle;
            row[1] = vehicle.getPrice();
            row[2] = vehicle.getSize();
            
            model.addRow(row);
        }
    }
    
    public void populateCast(){
        DefaultTableModel model = (DefaultTableModel) CastTable.getModel();
        model.setRowCount(0);
        totalPrice = 0;
        for (Map<Vehicle,Integer> map : cast){
            for(Vehicle key : map.keySet()){
                Object[] row = new Object[3];
                row[0] = key;
                row[1] = map.get(key);
                row[2] = String.format("%.2f", key.getPrice()*map.get(key)); 
                model.addRow(row);
                totalPrice += key.getPrice()*map.get(key);
            }
            
        }
             SumPrice.setText(String.format("%.2f", totalPrice));
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CastTable = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();
        sum = new javax.swing.JTextField();
        SumPrice = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lblTitle2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        backJButton = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        lblTitle3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 206, 163));

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Price(USD)", "Size(T)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProductTable);
        if (ProductTable.getColumnModel().getColumnCount() > 0) {
            ProductTable.getColumnModel().getColumn(0).setResizable(false);
            ProductTable.getColumnModel().getColumn(1).setResizable(false);
            ProductTable.getColumnModel().getColumn(2).setResizable(false);
        }

        requestTestJButton.setBackground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 132, 25));
        requestTestJButton.setText("Add To Cast");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(103, 144, 247));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CastTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Vehicle", "Quantity", "TotalPrice"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(CastTable);
        if (CastTable.getColumnModel().getColumnCount() > 0) {
            CastTable.getColumnModel().getColumn(0).setResizable(false);
            CastTable.getColumnModel().getColumn(1).setResizable(false);
            CastTable.getColumnModel().getColumn(2).setResizable(false);
        }

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("My Cast");

        lblTitle1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle1.setText("Product List");

        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });

        SumPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumPriceActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(250, 70, 75));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblTitle2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle2.setText("Sum(USD)");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(60, 117, 255));
        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblTitle3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle3.setText("Address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(backJButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(requestTestJButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SumPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(lblTitle3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(lblTitle1)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTitle1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backJButton))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requestTestJButton)
                            .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SumPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(lblTitle2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle3))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        int selectedRowIndex = ProductTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Vehicle vehicle = (Vehicle) ProductTable.getValueAt(selectedRowIndex, 0);
        Map<Vehicle,Integer> map = new HashMap<>();
        map.put(vehicle, Integer.parseInt(sum.getText()));
        cast.add(map);
        populateCast();
        
        
        
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void SumPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SumPriceActionPerformed

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        order = new Order();
        order.setVehicles(cast);
        order.setTotal(totalPrice);
        order.setCustomer(userAccount);
        order.setStatus(1);
        order.setAddress(jComboBox2.getSelectedItem().toString());
        List<Company> companys =  ecosystem.getCompanyDirectory();
        for(int i=0;i<companys.size();i++){
            if(companys.get(i).getName().equals(jComboBox1.getSelectedItem())){
                order.setCompany(companys.get(i));
        }
        }
        ecosystem.getOrderDirectory().add(order);
        System.out.println(ecosystem.getOrderDirectory());
        JOptionPane.showMessageDialog(null, "You have made an order successfully!", "Warning", JOptionPane.WARNING_MESSAGE);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
//        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        //        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CastTable;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField SumPrice;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTitle3;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextField sum;
    // End of variables declaration//GEN-END:variables

    private void populateCombo() {
        jComboBox1.removeAllItems();
        for(Company company : ecosystem.getCompanyDirectory()){
            jComboBox1.addItem(company.getName());
        }
    }

    private void populateCombo1() {
        jComboBox2.removeAllItems();
        jComboBox2.addItem("New York");
        jComboBox2.addItem("Boston");
        jComboBox2.addItem("Washington");
    }
}
