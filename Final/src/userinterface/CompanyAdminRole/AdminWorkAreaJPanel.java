

package userinterface.CompanyAdminRole;


import Business.Company.Company;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    EcoSystem ecosystem;
    Company thisCompany;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = business;
        this.userAccount = account;
        enterpriseLabel.setText(userAccount.getUsername());
        for(Company company : ecosystem.getCompanyDirectory()){
            if(company.getName().equals(userAccount.getUsername())){
                thisCompany = company;
            }
        }
      
        
    }
    
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userJButton.setBackground(new java.awt.Color(255, 206, 163));
        userJButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userJButton.setForeground(new java.awt.Color(204, 103, 16));
        userJButton.setText("View Comments");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 190, -1));

        manageEmployeeJButton.setBackground(new java.awt.Color(255, 206, 163));
        manageEmployeeJButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        manageEmployeeJButton.setForeground(new java.awt.Color(68, 118, 244));
        manageEmployeeJButton.setText("Manage menu");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 190, -1));

        manageOrganizationJButton.setBackground(new java.awt.Color(255, 206, 163));
        manageOrganizationJButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(255, 96, 102));
        manageOrganizationJButton.setText("Manage Orders");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 190, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 120, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Manage company information");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Company :");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/company.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 810, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageInfoJPanel mijp = new ManageInfoJPanel(userProcessContainer,thisCompany,ecosystem);
        userProcessContainer.add("mijp", mijp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        ManageMenuJPanel mmjp = new ManageMenuJPanel(userProcessContainer,thisCompany,ecosystem);
        userProcessContainer.add("mmjp", mmjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        ManageOrderJPanel mojp = new ManageOrderJPanel(userProcessContainer,thisCompany,ecosystem);
        userProcessContainer.add("mojp", mojp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
    
}
