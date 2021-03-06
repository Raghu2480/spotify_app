package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String userPhoneNo;
    private String userCity;
    private String userState;
    private String userPincode;
    private String userEmail;
    private String userPassword;

    public User() {
    }

    public User(int userId, String firstName, String lastName, String userName, String userPhoneNo, String userCity, String userState, String userPincode, String userEmail, String userPassword) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userPhoneNo = userPhoneNo;
        this.userCity = userCity;
        this.userState = userState;
        this.userPincode = userPincode;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoneNo() {
        return userPhoneNo;
    }

    public void setUserPhoneNo(String userPhoneNo) {
        this.userPhoneNo = userPhoneNo;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getUserPincode() {
        return userPincode;
    }

    public void setUserPincode(String userPincode) {
        this.userPincode = userPincode;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", userPhoneNo='" + userPhoneNo + '\'' +
                ", userCity='" + userCity + '\'' +
                ", userState='" + userState + '\'' +
                ", userPincode='" + userPincode + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
