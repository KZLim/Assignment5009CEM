/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.assignment.assignment5009cem;

/**
 *
 * @author User
 */
public class Users {
    
    //singlton declaration 
    private static Users instance = null;
    
    //variable declaration and initialization
    private String userID = "";
    private String userName = "";
    private String password = "";
    private String email = "";
    private String contactNumber = "";
    
    //constructor
    private Users(){
        
        userID = "";
        userName = "";
        password = "";
        email = "";
        contactNumber = "";
    }
    
    //getter and setter
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    //get singleton instance 
    public static Users getInstance(){
        if (instance == null) {
            instance = new Users();
        }
        return instance;
    }
}
