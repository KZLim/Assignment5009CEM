/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.assignment.assignment5009cem;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class ServicesUI extends javax.swing.JFrame {

    /**
     * Creates new form services
     */
    public ServicesUI() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);  
        label_servicesTitle.setFont(new Font("Serif", Font.BOLD, 20));
        button_submit.setFont(new Font("Serif", Font.BOLD, 14));
        label_typeOfServicesTitle.setFont(new Font("Serif", Font.PLAIN, 14));
        label_descriptionTitle.setFont(new Font("Serif", Font.PLAIN, 14));
        comboBox_serviceType.setFont(new Font("Serif", Font.PLAIN, 14));
        textArea_description.setFont(new Font("Serif", Font.PLAIN, 14));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jdialog_registerComplete = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button_done = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label_servicesTitle = new javax.swing.JLabel();
        label_typeOfServicesTitle = new javax.swing.JLabel();
        label_descriptionTitle = new javax.swing.JLabel();
        comboBox_serviceType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_description = new javax.swing.JTextArea();
        button_submit = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jdialog_registerComplete.setSize(new java.awt.Dimension(540, 400));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thank You for Registering with Us.");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Our Admin Will Get In Touch With You Shortly");

        button_done.setText("Done");
        button_done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_doneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jdialog_registerCompleteLayout = new javax.swing.GroupLayout(jdialog_registerComplete.getContentPane());
        jdialog_registerComplete.getContentPane().setLayout(jdialog_registerCompleteLayout);
        jdialog_registerCompleteLayout.setHorizontalGroup(
            jdialog_registerCompleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdialog_registerCompleteLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jdialog_registerCompleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jdialog_registerCompleteLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(button_done, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jdialog_registerCompleteLayout.setVerticalGroup(
            jdialog_registerCompleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdialog_registerCompleteLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(button_done)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 231, 235));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 251, 235));

        label_servicesTitle.setForeground(new java.awt.Color(64, 50, 184));
        label_servicesTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_servicesTitle.setText("Services");

        label_typeOfServicesTitle.setText("Types of services :");

        label_descriptionTitle.setText("Description :");

        comboBox_serviceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mechanic", "Electrician", "Mechanic/Electrician" }));

        textArea_description.setColumns(20);
        textArea_description.setRows(5);
        jScrollPane1.setViewportView(textArea_description);

        button_submit.setBackground(new java.awt.Color(64, 50, 184));
        button_submit.setForeground(new java.awt.Color(255, 255, 255));
        button_submit.setText("Submit >");
        button_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_servicesTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_typeOfServicesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_descriptionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox_serviceType, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(444, 444, 444))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(label_servicesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_typeOfServicesTitle)
                    .addComponent(comboBox_serviceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_descriptionTitle))
                .addGap(33, 33, 33)
                .addComponent(button_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_submitActionPerformed
        
        //set the register status. Deafult at true which is go ahead
        boolean registerStatus = true;
        
        //getting company class data from all the previous step that data is generated and stored
        Company companyEntity = Company.getInstance();
        String companyID = companyEntity.getCompanyID();
        String password = companyEntity.getPassword();
        String companyName = companyEntity.getCompanyName();
        String companyAddress = companyEntity.getCompanyAddress();
        String postalCode = companyEntity.getPostalCode();
        String contactNumber = companyEntity.getContactNumber();
        String date = companyEntity.getSubscriptionDate();
        String duration = companyEntity.getSubscriptionDuration();
        String status = companyEntity.getStatus();
        
        //setting services class data 
        Services servicesEntity = Services.getInstance();
        servicesEntity.setProviderID(companyID);
        servicesEntity.setProviderName(companyName);
        servicesEntity.setServiceType(comboBox_serviceType.getSelectedItem().toString());
        servicesEntity.setServiceDescription(textArea_description.getText());
        servicesEntity.setPostalCode(postalCode);
        servicesEntity.setApprovalStatus("Pending");
        
        
        // entering into the database
        try{
            Connection conDB = DriverManager.getConnection("jdbc:mysql://localhost/oecd","root","");
            Statement stmt = conDB.createStatement();

            /**code for insert operation. Here we insert into two table, first is company table second is services table
             * the company table will store the company data while the services will store all the services data provided by that company
             */
            stmt.executeUpdate("INSERT INTO company (companyID, password,companyName,companyAddress,postalCode,contactNumber,subscriptionDate,subscriptionDuration,status) "
                    + "VALUES ('"+companyID+"','"+password+"','"+companyName+"',"
                            + "'"+companyAddress+"','"+postalCode+"','"+contactNumber+"','"+date+"','"+duration+"','"+status+"')");
            
            
            stmt.executeUpdate("INSERT INTO services (providerID, providerName,serviceType,serviceDescription,postalCode,status)"
                    + "VALUES ('"+companyID+"','"+companyName+"','"+servicesEntity.getServiceType()+"',"
                            + "'"+servicesEntity.getServiceDescription()+"','"+servicesEntity.getPostalCode()+"','"+servicesEntity.getApprovalStatus()+"')");
            
        }
        catch(SQLException exception){
            label_servicesTitle.setText("Connection Error. Unable To Register");
            registerStatus = false;
            
        }
        
        //if entering into database is success a pop up window will tell the user to wait for the admin respond and bring user back to login ui
        if(registerStatus){
            jdialog_registerComplete.pack();
            jdialog_registerComplete.setLocationRelativeTo(null);
            jdialog_registerComplete.show();
        }
        
    }//GEN-LAST:event_button_submitActionPerformed
    
    //button in the pop up window, if click will bring user back to login ui
    private void button_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_doneActionPerformed
        LoginUI itemloader = new LoginUI();
        itemloader.setVisible(true);
        dispose();
        jdialog_registerComplete.dispose();
    }//GEN-LAST:event_button_doneActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServicesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServicesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServicesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServicesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicesUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_done;
    private static javax.swing.JButton button_submit;
    private static javax.swing.JComboBox<String> comboBox_serviceType;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jdialog_registerComplete;
    private static javax.swing.JLabel label_descriptionTitle;
    private static javax.swing.JLabel label_servicesTitle;
    private javax.swing.JLabel label_typeOfServicesTitle;
    private static javax.swing.JTextArea textArea_description;
    // End of variables declaration//GEN-END:variables
}
