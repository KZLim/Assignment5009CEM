/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.assignment.assignment5009cem;


import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class CompanyDashboardUI extends javax.swing.JFrame {
    
    int requestID = 0;
    
    /**
     * Creates new form companyDashboardUI
     */
    public CompanyDashboardUI() {
        initComponents();
        //this 2 lines below are to set the windows/frame in the middle of the user screen
        this.pack();  
        this.setLocationRelativeTo(null); 
        
        //decorative settings to the UI
        label_welcomeTitle.setFont(new Font("Serif", Font.BOLD, 20));
        getContentPane().setBackground(new java.awt.Color(255, 251,235));
        jLayeredPane1.setVisible(false);
        label_historyRecordTitle.setFont(new Font("Serif", Font.BOLD, 20));
        label_helpRequestTitle.setFont(new Font("Serif", Font.BOLD, 20));
        label_companyProfileTitle.setFont(new Font("Serif", Font.BOLD, 20));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdialog_acceptJob = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        button_accept = new javax.swing.JButton();
        button_cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        button_helpRequest = new javax.swing.JButton();
        button_viewHistory = new javax.swing.JButton();
        button_profile = new javax.swing.JButton();
        label_welcomeTitle = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_helpRequest = new javax.swing.JTable();
        label_helpRequestTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_viewHistory = new javax.swing.JTable();
        label_historyRecordTitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        label_companyIDTitle = new javax.swing.JLabel();
        label_companyNameTitle = new javax.swing.JLabel();
        label_addressTitle = new javax.swing.JLabel();
        label_postalCodeTitle = new javax.swing.JLabel();
        label_contactNumberTitle = new javax.swing.JLabel();
        label_subscriptionDateTitle = new javax.swing.JLabel();
        label_subscriptionDurationTitle = new javax.swing.JLabel();
        label_companyProfileTitle = new javax.swing.JLabel();
        label_id = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        label_address = new javax.swing.JLabel();
        label_postalCode = new javax.swing.JLabel();
        label_contactNum = new javax.swing.JLabel();
        label_subDate = new javax.swing.JLabel();
        label_subDuration = new javax.swing.JLabel();

        jdialog_acceptJob.setSize(new java.awt.Dimension(540, 400));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Are you sure you want to accept this request ?");

        button_accept.setText("Accept");
        button_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_acceptActionPerformed(evt);
            }
        });

        button_cancel.setText("Cancel");
        button_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jdialog_acceptJobLayout = new javax.swing.GroupLayout(jdialog_acceptJob.getContentPane());
        jdialog_acceptJob.getContentPane().setLayout(jdialog_acceptJobLayout);
        jdialog_acceptJobLayout.setHorizontalGroup(
            jdialog_acceptJobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdialog_acceptJobLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jdialog_acceptJobLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(button_accept, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(button_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jdialog_acceptJobLayout.setVerticalGroup(
            jdialog_acceptJobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdialog_acceptJobLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(56, 56, 56)
                .addGroup(jdialog_acceptJobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_accept)
                    .addComponent(button_cancel))
                .addGap(133, 133, 133))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 251, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 200));
        jPanel1.setRequestFocusEnabled(false);

        button_helpRequest.setBackground(new java.awt.Color(64, 50, 184));
        button_helpRequest.setForeground(new java.awt.Color(255, 255, 255));
        button_helpRequest.setText("Help Request");
        button_helpRequest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_helpRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_helpRequestActionPerformed(evt);
            }
        });

        button_viewHistory.setBackground(new java.awt.Color(60, 54, 184));
        button_viewHistory.setForeground(new java.awt.Color(255, 255, 255));
        button_viewHistory.setText("View Record");
        button_viewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_viewHistoryActionPerformed(evt);
            }
        });

        button_profile.setBackground(new java.awt.Color(64, 50, 184));
        button_profile.setForeground(new java.awt.Color(255, 255, 255));
        button_profile.setText("Profile");
        button_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_profileActionPerformed(evt);
            }
        });

        label_welcomeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_welcomeTitle.setText("Welcome To The Company Dashboard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(button_helpRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(button_viewHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(button_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_welcomeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_welcomeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_helpRequest)
                    .addComponent(button_viewHistory)
                    .addComponent(button_profile))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -2, 1000, 200));

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 251, 235));

        table_helpRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "User ID", "User Name", "Service Type", "Description", "Location", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_helpRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_helpRequestMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_helpRequest);
        if (table_helpRequest.getColumnModel().getColumnCount() > 0) {
            table_helpRequest.getColumnModel().getColumn(0).setResizable(false);
            table_helpRequest.getColumnModel().getColumn(1).setResizable(false);
            table_helpRequest.getColumnModel().getColumn(2).setResizable(false);
            table_helpRequest.getColumnModel().getColumn(3).setResizable(false);
            table_helpRequest.getColumnModel().getColumn(4).setResizable(false);
            table_helpRequest.getColumnModel().getColumn(5).setResizable(false);
            table_helpRequest.getColumnModel().getColumn(6).setResizable(false);
        }

        label_helpRequestTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_helpRequestTitle.setText("Help Request");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addComponent(label_helpRequestTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_helpRequestTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        jLayeredPane1.add(jPanel2, "card2");

        jPanel3.setBackground(new java.awt.Color(255, 251, 235));

        table_viewHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "User ID", "User Name", "Service Type", "Status", "Location", "Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_viewHistory);
        if (table_viewHistory.getColumnModel().getColumnCount() > 0) {
            table_viewHistory.getColumnModel().getColumn(0).setResizable(false);
            table_viewHistory.getColumnModel().getColumn(1).setResizable(false);
            table_viewHistory.getColumnModel().getColumn(2).setResizable(false);
            table_viewHistory.getColumnModel().getColumn(3).setResizable(false);
            table_viewHistory.getColumnModel().getColumn(4).setResizable(false);
            table_viewHistory.getColumnModel().getColumn(5).setResizable(false);
            table_viewHistory.getColumnModel().getColumn(6).setResizable(false);
        }

        label_historyRecordTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_historyRecordTitle.setText("History Record");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addComponent(label_historyRecordTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_historyRecordTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        jLayeredPane1.add(jPanel3, "card3");

        jPanel4.setBackground(new java.awt.Color(255, 251, 235));

        label_companyIDTitle.setText("Company ID:");

        label_companyNameTitle.setText("Company Name: ");

        label_addressTitle.setText("Address:");

        label_postalCodeTitle.setText("Postal Code:");

        label_contactNumberTitle.setText("Contact Number: ");

        label_subscriptionDateTitle.setText("Subscription Date: ");

        label_subscriptionDurationTitle.setText("Subscription Duration: ");

        label_companyProfileTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_companyProfileTitle.setText("Company Profile");
        label_companyProfileTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        label_id.setText("CompanyID");

        label_name.setText("CompanyName");

        label_address.setText("Address");

        label_postalCode.setText("PostalCode");

        label_contactNum.setText("ContactNumber");

        label_subDate.setText("Subscription Date");

        label_subDuration.setText("Subscription Duration");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_companyIDTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_companyNameTitle)
                    .addComponent(label_addressTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_postalCodeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_contactNumberTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_subscriptionDateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_subscriptionDurationTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_postalCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_contactNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_subDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_subDuration, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
                .addContainerGap(286, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_companyProfileTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(label_companyProfileTitle)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_companyIDTitle)
                    .addComponent(label_id))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_companyNameTitle)
                    .addComponent(label_name))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_addressTitle)
                    .addComponent(label_address))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_postalCodeTitle)
                    .addComponent(label_postalCode))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_contactNumberTitle)
                    .addComponent(label_contactNum))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_subscriptionDateTitle)
                    .addComponent(label_subDate))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_subscriptionDurationTitle)
                    .addComponent(label_subDuration))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel4, "card4");

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1000, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_helpRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_helpRequestActionPerformed
        
        Connection conDB = null;
        int orderID = 0;
        String userID = "";
        String userName = "";
        String serviceType = "";
        String description = "";
        String location = "";
        String status = "";
        
        Company companyEntity = Company.getInstance();
        
        
        try{
            conDB = DriverManager.getConnection("jdbc:mysql://localhost/oecd","root","");
            Statement stmt = conDB.createStatement();
            
            //code for read operation
            String query = "SELECT * from request WHERE providerID = '" +companyEntity.getCompanyID()+ "'";
            ResultSet rs = stmt.executeQuery(query);
            
            DefaultTableModel model = (DefaultTableModel) table_helpRequest.getModel();
            model.setRowCount(0);
            
            while(rs.next()){
                
               if(!rs.getString("status").equals("Done")){
                   
                   orderID =(Integer.parseInt(rs.getString("requestID")));
                   userID = rs.getString("userID");
                   userName = rs.getString("username");
                   serviceType = rs.getString("serviceType");
                   description = rs.getString("description");
                   location = rs.getString("location");
                   status = rs.getString("status");
                   
                   //insert into table using the model
                   Object[] row = {orderID,userID,userName,serviceType,description,location,status};
                   model.addRow(row); 
                }
            }
        }
        catch(SQLException exception){
            
            System.out.print(exception.getMessage());
        }
        
        jLayeredPane1.setVisible(true);
        switchPanel(jPanel2);  //each button use this function to swtich the layered panel by passing in which panel
    }//GEN-LAST:event_button_helpRequestActionPerformed
        
    private void button_viewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_viewHistoryActionPerformed
        
        Connection conDB = null;
        int orderID = 0;
        String userID = "";
        String userName = "";
        String serviceType = "";
        String description = "";
        String location = "";
        String status = "";
        String feedback = "";
        
        Company companyEntity = Company.getInstance();
        
        try{
            conDB = DriverManager.getConnection("jdbc:mysql://localhost/oecd","root","");
            Statement stmt = conDB.createStatement();
            
            //code for read operation
            String query = "SELECT * from request WHERE providerID = '" +companyEntity.getCompanyID()+ "'";
            ResultSet rs = stmt.executeQuery(query);
            
            DefaultTableModel model = (DefaultTableModel) table_viewHistory.getModel();
            model.setRowCount(0);
            
            while(rs.next()){
                
               if(rs.getString("status").equals("Done")){
                   
                   orderID =(Integer.parseInt(rs.getString("requestID")));
                   userID = rs.getString("userID");
                   userName = rs.getString("username");
                   serviceType = rs.getString("serviceType");
                   location = rs.getString("location");
                   status = rs.getString("status");
                   feedback = rs.getString("feedback");
                   
                   //insert into table using the model
                   Object[] row = {orderID,userID,userName,serviceType,status,location,feedback};
                   model.addRow(row); 
                }
            }
        }
        catch(SQLException exception){
            System.out.print(exception.getMessage());
        }
        
        
        jLayeredPane1.setVisible(true);
        switchPanel(jPanel3);
    }//GEN-LAST:event_button_viewHistoryActionPerformed

    private void button_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_profileActionPerformed
        Company companyEntity = Company.getInstance();  //getting the companyEntity 
        
        //loading all the data from the company class into the label to display out
        label_name.setText(companyEntity.getCompanyName());
        label_id.setText(companyEntity.getCompanyID() + "");
        label_address.setText(companyEntity.getCompanyAddress());
        label_postalCode.setText(companyEntity.getPostalCode() + "");
        label_contactNum.setText(companyEntity.getContactNumber() + "");
        label_subDate.setText(companyEntity.getSubscriptionDate() + "");
        label_subDuration.setText(companyEntity.getSubscriptionDuration());
        
        jLayeredPane1.setVisible(true);
        switchPanel(jPanel4);
    }//GEN-LAST:event_button_profileActionPerformed

    private void table_helpRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_helpRequestMouseClicked

        int index = table_helpRequest.getSelectedRow();
        TableModel model = table_helpRequest.getModel();
        
        requestID = (Integer.parseInt(model.getValueAt(index, 0).toString()));
        
        //checking the state of the help request which correspond to the table model at column 6
        if(model.getValueAt(index, 6).toString().equals("Pending")){
            jdialog_acceptJob.setVisible(true);
            jdialog_acceptJob.pack();
            jdialog_acceptJob.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_table_helpRequestMouseClicked

    private void button_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_acceptActionPerformed

        Connection conDB = null;

        String newStatus = "Accepted";

        try{
            conDB = DriverManager.getConnection("jdbc:mysql://localhost/oecd","root","");
            Statement stmt = conDB.createStatement();

            //code for update operation
            stmt.executeUpdate("update request set status = '"+newStatus+"' where requestID = '"+requestID+"'");

        }
        catch(SQLException exception){

            System.out.print(exception.getMessage());
        }

        jdialog_acceptJob.dispose();
    }//GEN-LAST:event_button_acceptActionPerformed

    private void button_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelActionPerformed
        jdialog_acceptJob.dispose();
    }//GEN-LAST:event_button_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(CompanyDashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompanyDashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompanyDashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompanyDashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompanyDashboardUI().setVisible(true);               

            }
        });
    }
    
    //switch panel function is to switch the layered panels in the UI when button is click
    public void switchPanel(JPanel panel){
        jLayeredPane1.removeAll();
        jLayeredPane1.add(panel);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_accept;
    private javax.swing.JButton button_cancel;
    private static javax.swing.JButton button_helpRequest;
    private javax.swing.JButton button_profile;
    private javax.swing.JButton button_viewHistory;
    private javax.swing.JLabel jLabel4;
    private static javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jdialog_acceptJob;
    private javax.swing.JLabel label_address;
    private javax.swing.JLabel label_addressTitle;
    private javax.swing.JLabel label_companyIDTitle;
    private javax.swing.JLabel label_companyNameTitle;
    private static javax.swing.JLabel label_companyProfileTitle;
    private javax.swing.JLabel label_contactNum;
    private javax.swing.JLabel label_contactNumberTitle;
    private static javax.swing.JLabel label_helpRequestTitle;
    private static javax.swing.JLabel label_historyRecordTitle;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_postalCode;
    private javax.swing.JLabel label_postalCodeTitle;
    private javax.swing.JLabel label_subDate;
    private javax.swing.JLabel label_subDuration;
    private javax.swing.JLabel label_subscriptionDateTitle;
    private javax.swing.JLabel label_subscriptionDurationTitle;
    private javax.swing.JLabel label_welcomeTitle;
    private javax.swing.JTable table_helpRequest;
    private javax.swing.JTable table_viewHistory;
    // End of variables declaration//GEN-END:variables
}