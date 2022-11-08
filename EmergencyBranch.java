/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.assignment.assignment5009cem;

/**
 *
 * @author User
 */
public class EmergencyBranch {
    
    //singleton declaration 
    private static EmergencyBranch instance = null;

    //variable declaration and initialization
    private String branchID = "";
    private String branchName = "";
    private String branchAddress = "";
    private String postalCode = "";
    private String contactNumber = "";
    
    //constructor 
    private EmergencyBranch(){
        
        branchID = "";
        branchName = "";
        branchAddress = "";
        postalCode = "";
        contactNumber = "";
          
    }
    
    //getter and setter
    public String getBranchID() {
        return branchID;
    }

    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    //get singleton instance 
    public static EmergencyBranch getInstance() {
        if (instance == null) {
            instance = new EmergencyBranch();
        }
        return instance;
    }
}
