package com.company;

public class BusinessCard {
    private String FirstName;
    private String LastName;
    private String Company;
    private String PhoneNumber;
    private String Address;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public BusinessCard(String firstName, String lastName, String company, String phoneNumber, String address) {
        FirstName = firstName;
        LastName = lastName;
        Company = company;
        PhoneNumber = phoneNumber;
        Address = address;
    }

    @Override
    public String toString() {
        return "BusinessCard{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Company='" + Company + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
