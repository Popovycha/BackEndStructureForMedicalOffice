package com.gmail.mybmcc22.models;

import com.gmail.mybmcc22.utilities.GenderType;

import java.util.Date;
import java.util.Objects;

public class Patient {
    private String firstName;
    private String lastName;
    private String DOB;
    private String state;
    private String city;
    private String address;
    private String email;
    private String patientId;
    private String cin;
    private GenderType gender;
    private boolean isvalid;

    private void setName( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Patient ( String firstName, String lastName,String DOB,String state, String city, String address,
                     String email, String patientId, String cin, GenderType gender){
        setName( firstName, lastName);
        this.DOB = DOB;
        this.state = state;
        this.city = city;
        this.address = address;
        this.email = email;
        this.patientId = patientId;
        this.cin = cin;
        this.gender = gender;
        this.isvalid = true;
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

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public String getPatientFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Patient{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", DOB='" + DOB + '\'' +
                ", email='" + email + '\'' +
                ", patientId=" + patientId +
                ", cin=" + cin +
                ", gender=" + gender +
                ", isvalid=" + isvalid +
                '}';
    }
    public int hashCode() {
        return Objects.hash( firstName, lastName, DOB, state, city, address,
                 email, patientId, cin, gender, isvalid);
    }



}
