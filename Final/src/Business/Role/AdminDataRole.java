/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.CompanyAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import userinterface.companyDataRole.DataWorkArea;

/**
 *
 * @author raunak
 */
public class AdminDataRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new DataWorkArea(userProcessContainer,account,business);
    }

    
    
}
