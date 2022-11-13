/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.assignment.assignment5009cem;

import java.awt.Font;



/**
 *
 * @author User
 */
public class RegisterUI extends javax.swing.JFrame {
    
    /**
     * Creates new form RegisterUI
     */
    public RegisterUI() {
        initComponents();
        //this below 2 lines of code is to set the frame in the middle of thee user screen
        this.pack();
        this.setLocationRelativeTo(null);
        label_registerTitle.setFont(new Font("Serif", Font.BOLD, 20));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_companyNameTitle = new javax.swing.JLabel();
        label_passwordTitle = new javax.swing.JLabel();
        label_confirmPasswordTitle = new javax.swing.JLabel();
        label_companyAddressTitle = new javax.swing.JLabel();
        label_contactNumberTitle = new javax.swing.JLabel();
        label_postalCodeTitle = new javax.swing.JLabel();
        textField_companyName = new javax.swing.JTextField();
        passwordField_password = new javax.swing.JPasswordField();
        passwordField_confirmPassword = new javax.swing.JPasswordField();
        textField_companyAddress = new javax.swing.JTextField();
        textField_postalCode = new javax.swing.JTextField();
        textField_contactNumber = new javax.swing.JTextField();
        label_registerTitle = new javax.swing.JLabel();
        button_goBackLogin = new javax.swing.JButton();
        button_next = new javax.swing.JButton();
        label_companyRegistrationNumber = new javax.swing.JLabel();
        textField_registrationNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 251, 235));

        label_companyNameTitle.setForeground(new java.awt.Color(64, 50, 184));
        label_companyNameTitle.setText("Company Name:");

        label_passwordTitle.setForeground(new java.awt.Color(64, 50, 184));
        label_passwordTitle.setText("Password: ");

        label_confirmPasswordTitle.setForeground(new java.awt.Color(64, 50, 184));
        label_confirmPasswordTitle.setText("Confirm Password: ");

        label_companyAddressTitle.setForeground(new java.awt.Color(64, 50, 184));
        label_companyAddressTitle.setText("Company Address: ");

        label_contactNumberTitle.setForeground(new java.awt.Color(64, 50, 184));
        label_contactNumberTitle.setText("Contact Number");

        label_postalCodeTitle.setForeground(new java.awt.Color(64, 50, 184));
        label_postalCodeTitle.setText("Postal Code");

        label_registerTitle.setForeground(new java.awt.Color(64, 50, 184));
        label_registerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_registerTitle.setText("Register");

        button_goBackLogin.setBackground(new java.awt.Color(64, 50, 184));
        button_goBackLogin.setForeground(new java.awt.Color(255, 255, 255));
        button_goBackLogin.setText("Go Back ");
        button_goBackLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_goBackLoginActionPerformed(evt);
            }
        });

        button_next.setBackground(new java.awt.Color(64, 50, 184));
        button_next.setForeground(new java.awt.Color(255, 255, 255));
        button_next.setText("Next");
        button_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_nextActionPerformed(evt);
            }
        });

        label_companyRegistrationNumber.setForeground(new java.awt.Color(64, 50, 184));
        label_companyRegistrationNumber.setText("Company Registration Number: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_registerTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_companyRegistrationNumber)
                        .addGap(18, 18, 18)
                        .addComponent(textField_registrationNumber))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(button_goBackLogin)
                        .addGap(18, 18, 18)
                        .addComponent(button_next))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_contactNumberTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_companyNameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_passwordTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_companyAddressTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_postalCodeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_confirmPasswordTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_companyName, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField_confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_companyAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_postalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_contactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(label_registerTitle)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_companyRegistrationNumber)
                    .addComponent(textField_registrationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_companyNameTitle)
                    .addComponent(textField_companyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_passwordTitle)
                    .addComponent(passwordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_confirmPasswordTitle)
                    .addComponent(passwordField_confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_companyAddressTitle)
                    .addComponent(textField_companyAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_postalCodeTitle)
                    .addComponent(textField_postalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_contactNumberTitle)
                    .addComponent(textField_contactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_goBackLogin)
                    .addComponent(button_next))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //go back to login page if the user want to
    private void button_goBackLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_goBackLoginActionPerformed
        LoginUI itemloader = new LoginUI();
        itemloader.setVisible(true);
        dispose();  
    }//GEN-LAST:event_button_goBackLoginActionPerformed
    
    //check thee data once next is click and all the fields are fill
    private void button_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_nextActionPerformed
        
        //register status to check whether is allowed to register. Default at true 
        boolean registerStatus = true;
          
        //taking the input in the fields and set into a variable
        String companyID = textField_registrationNumber.getText();
        String companyName = textField_companyName.getText();
        String password = passwordField_password.getText();
        String companyAddress = textField_companyAddress.getText();
        String postalCode = textField_postalCode.getText();
        String contactNumber = textField_contactNumber.getText();
        String confirmPassword = passwordField_confirmPassword.getText();
        
  
        
        //validation for the input fields
        if(String.valueOf(companyID).length() <12 || String.valueOf(companyID).isEmpty()){
            registerStatus = false;
            label_registerTitle.setText("Company REG Number Cannot Be Empty and Must Be 12 Digit");
        }
        else if(companyName.isEmpty()){
            registerStatus = false;
            label_registerTitle.setText("Company Name Cannot Be Empty");
        }
        else if(password.length() <12 || password.isEmpty()){
            registerStatus = false;
            label_registerTitle.setText("Password Must Be 12 Digit and Cannot Be Empty");
        }
        else if(!password.equals(confirmPassword)){
            registerStatus = false;
            label_registerTitle.setText("Password and Confirm Does Not Match");
        }
        else if(postalCode.isEmpty()){
            registerStatus = false;
            label_registerTitle.setText("Postal Code Cannot Be Empty");
        }
        else if(postalCode.length()<5 || postalCode.length()>5){
            registerStatus = false;
            label_registerTitle.setText("Postal Code Only Contains 5 Digit");
        }
        else if(contactNumber.isEmpty()){
            registerStatus = false;
            label_registerTitle.setText("Contact Number Cannot Be Empty");
        }
        else if(contactNumber.length()<10 || contactNumber.length()>11){
            registerStatus = false;
            label_registerTitle.setText("Contact Number Format Is Invalid");
        }
        
        //if the status of register stay true after the validation it will go in this block
        if(registerStatus){
            //use the company class setter to temporary store the data
            Company companyEntity = Company.getInstance();
            companyEntity.setCompanyID(companyID);
            companyEntity.setCompanyName(companyName);
            companyEntity.setPassword(password);
            companyEntity.setCompanyAddress(companyAddress);
            companyEntity.setPostalCode(postalCode);
            companyEntity.setContactNumber(contactNumber);
            
            //go to next step of the register process
            SubscriptionUI itemloader = new SubscriptionUI();
            itemloader.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_button_nextActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegisterUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_goBackLogin;
    private javax.swing.JButton button_next;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel label_companyAddressTitle;
    private static javax.swing.JLabel label_companyNameTitle;
    private javax.swing.JLabel label_companyRegistrationNumber;
    private static javax.swing.JLabel label_confirmPasswordTitle;
    private static javax.swing.JLabel label_contactNumberTitle;
    private static javax.swing.JLabel label_passwordTitle;
    private static javax.swing.JLabel label_postalCodeTitle;
    private javax.swing.JLabel label_registerTitle;
    private static javax.swing.JPasswordField passwordField_confirmPassword;
    private static javax.swing.JPasswordField passwordField_password;
    private static javax.swing.JTextField textField_companyAddress;
    private static javax.swing.JTextField textField_companyName;
    private static javax.swing.JTextField textField_contactNumber;
    private static javax.swing.JTextField textField_postalCode;
    private javax.swing.JTextField textField_registrationNumber;
    // End of variables declaration//GEN-END:variables
}
