/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.assignment.assignment5009cem;

/**
 *
 * @author User
 */
public class Company {
    
    //singlton declaration 
    private static Company instance = null;
    
    //variable declaration and initialization
    private long companyID = 0;
    private String password ="";
    private String companyName="";
    private String companyAddress = "";
    private int postalCode = 0;
    private String contactNumber = "";
    private String subscriptionDate = "";
    private String subscriptionDuration = "";
    private String status = "";
    
   
    
    //construtor
    private Company(){
        
        companyID = 0;
        password = "";
        companyName = "";
        companyAddress = "";
        postalCode = 0;
        contactNumber = "";
        subscriptionDate = "";
        subscriptionDuration = "";
        status = "";
        
    }
    
    //getter and setter
    public long getCompanyID() {
        return companyID;
    }

    public void setCompanyID(long companyID) {
        this.companyID = companyID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(String subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public String getSubscriptionDuration() {
        return subscriptionDuration;
    }

    public void setSubscriptionDuration(String subscriptionDuration) {
        this.subscriptionDuration = subscriptionDuration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
    
    //get singleton instance 
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
   
}
