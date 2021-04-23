/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Company.Company;
import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Role.AdminDataRole;
import Business.Role.CompanyAdminRole;
import Business.Role.CompanyDataRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.ServiceRole;
import Business.Role.WareHouseAdminRole;
import Business.Role.WareHouseDataRole;
import Business.UserAccount.UserAccount;
import Bussiness.Warehouse.WareHouse;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Yuton
 */
public class addAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form addAccountJPanel
     */
    private EcoSystem ecosystem;
    private Company company;
    private JPanel userProcessContainer;
    public addAccountJPanel(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = business;
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
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        phoneText1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        userNameText1 = new javax.swing.JTextField();
        addressText1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        passwordText1 = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        repeatPasswordText1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        btnBack1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        btnBack.setBackground(new java.awt.Color(0, 102, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jFormattedTextField1.setText("jFormattedTextField1");

        jScrollPane1.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(254, 102, 0));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("First Name(company):");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Please input account information");

        firstNameText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        phoneText1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("User Name:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Address:");

        userNameText1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameText1ActionPerformed(evt);
            }
        });

        addressText1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Password:");

        passwordText1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Repeat Password:");

        repeatPasswordText1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Phone:");

        roleComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CustomerRole", "CompanyAdminRole", "DeliverManRole", "WareHouseAdminRole", "ServiceRole", "CompanyDataRole", "WareHouseDataRole" }));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Role:");

        jButton1.setBackground(new java.awt.Color(255, 0, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Last Name(optional):");

        lastNameText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnBack1.setBackground(new java.awt.Color(0, 102, 255));
        btnBack1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBack1.setText("<< Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/add.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addressText1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(phoneText1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstNameText, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lastNameText, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(repeatPasswordText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passwordText1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnBack1)
                .addGap(53, 53, 53)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(userNameText1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(passwordText1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(repeatPasswordText1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(firstNameText))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(phoneText1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressText1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jLabel3))
                .addGap(761, 761, 761))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userNameText1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                              

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String userName = userNameText1.getText();
        String password = passwordText1.getText();
        String repeatPassword = repeatPasswordText1.getText();
        String firstName = firstNameText.getText();
        String lastName = lastNameText.getText();
        String phone = phoneText1.getText();
        String address = addressText1.getText();

        if(userName.isEmpty() || password.isEmpty() || firstName.isEmpty() || repeatPassword.isEmpty() || phone.isEmpty() || address.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input all information, some are empty!");
        }
        else if(!password.equals(repeatPassword)){
            JOptionPane.showMessageDialog(null, "Two password input are not equal!");
        }
        else{
            String role = roleComboBox.getSelectedItem().toString();
            if(role == "CustomerRole"){
                UserAccount uaCustomer1 = ecosystem.getUserAccountDirectory().createUserAccount(userName, password, new CustomerRole());
                int id = ecosystem.getCustomerDirectory().getCustomerList().size() + 1;
                Customer c1 = new Customer(id,firstName,lastName);
                uaCustomer1.setAddress(address);
                uaCustomer1.setPhone(phone);
                ecosystem.getCustomerDirectory().addCutomer(c1);
            }
            else if(role == "CompanyAdminRole"){
                UserAccount company1 = ecosystem.getUserAccountDirectory().createUserAccount(userName, password, new CompanyAdminRole());
                company1.setAddress(address);
                company1.setPhone(phone);
                Company com1 = new Company(firstName);
                ecosystem.getCompanyDirectory().add(com1);
        }
            else if(role == "DeliverManRole"){
                UserAccount delivery1 = ecosystem.getUserAccountDirectory().createUserAccount(userName, password, new DeliverManRole());
                delivery1.setAddress(address);
                delivery1.setPhone(phone);
                int id = ecosystem.getDeliveryManDirectory().getDeliveryManList().size() + 1;
                DeliveryMan man1 = new DeliveryMan(id,firstName,lastName);
                ecosystem.getDeliveryManDirectory().addDeliveryManDirectory(man1);
            }
            else if(role == "WareHouseAdminRole"){
                UserAccount wha = ecosystem.getUserAccountDirectory().createUserAccount(userName, password, new WareHouseAdminRole());
                wha.setAddress(address);
                wha.setPhone(phone);
                WareHouse wh1 = new WareHouse(firstName);
                ecosystem.getWareHouseDirectory().add(wh1);
            }
            else if(role == "ServiceRole"){
                UserAccount s1 = ecosystem.getUserAccountDirectory().createUserAccount(userName, password, new ServiceRole());
                s1.setAddress(address);
                s1.setPhone(phone);
            }
            else if(role == "CompanyDataRole"){
                UserAccount cd1 = ecosystem.getUserAccountDirectory().createUserAccount(userName, password, new CompanyDataRole());
                cd1.setAddress(address);
                cd1.setPhone(phone);
            }
            else if(role == "AdminDataRole"){
                UserAccount ad1 = ecosystem.getUserAccountDirectory().createUserAccount(userName, password, new AdminDataRole());
                ad1.setAddress(address);
                ad1.setPhone(phone);
            }
            else if(role == "WareHouseDataRole"){
                UserAccount wd1 = ecosystem.getUserAccountDirectory().createUserAccount("wd1", "123", new WareHouseDataRole());
                wd1.setAddress(address);
                wd1.setPhone(phone);
            }
        }
            JOptionPane.showMessageDialog(null, "Account create sucessfully!");
            
            firstNameText.setText("");
            passwordText1.setText("");
            repeatPasswordText1.setText("");
            firstNameText.setText("");
            lastNameText.setText("");
            phoneText1.setText("");
            addressText1.setText("");
            userNameText1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressText1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JPasswordField passwordText1;
    private javax.swing.JTextField phoneText1;
    private javax.swing.JPasswordField repeatPasswordText1;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JTextField userNameText1;
    // End of variables declaration//GEN-END:variables
}
