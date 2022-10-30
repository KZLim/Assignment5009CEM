/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.assignment.assignment5009cem;

/**
 *
 * @author User
 */
public class Services {
    
    //Singletone declaration
    private static Services instance = null;
    
    //variable declaration and initializzation
    int serviceID = 0;
    long providerID = 0;
    String providerName = "";
    String serviceType = "";
    String serviceDescription = "";
    int postalCode = 0;
    String approvalStatus = "";
    
    //Constructor
    private Services(){
        
        serviceID = 0;
        providerID = 0;
        providerName = "";
        serviceType = "";
        serviceDescription = "";
        postalCode = 0;
        approvalStatus = "";
  
    }
    
    //getter and setter
    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public long getProviderID() {
        return providerID;
    }

    public void setProviderID(long providerID) {
        this.providerID = providerID;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }
    
    //get instances of this class object
    public static Services getInstance() {
        if (instance == null) {
            instance = new Services();
        }
        return instance;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
