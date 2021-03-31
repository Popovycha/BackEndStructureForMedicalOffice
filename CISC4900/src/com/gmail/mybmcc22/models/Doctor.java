package com.gmail.mybmcc22.models;

public class Doctor {
    private String suffix;
    private String firstName;
    private String lastName;
    private String npi;
    private String speciality;
    private String email;
    private String state;
    private String city;
    private String address;

    public Doctor(String suffix, String firstName, String lastName, String npi, String speciality, String email, String state, String city, String address ) {
        this.suffix = suffix;
        this.firstName = firstName;
        this.lastName = lastName;
        this.npi = npi;
        this.speciality = speciality;
        this.email = email;
        this.state = state;
        this.city = city;
        this.address = address;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
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

    public String getNpi() {
        return npi;
    }

    public void setNpi(String npi) {
        this.npi = npi;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getDoctorFullName() {
        return suffix + ". " + firstName + " " + lastName;
    }
    public String getDoctorMailingAddress() {
        StringBuilder sb = new StringBuilder(suffix);
        sb.append(" ");
        sb.append(firstName.substring(0,1));
        sb.append(" ");
        sb.append(lastName);
        sb.append(", ");
        sb.append(address);
        sb.append(", ");
        sb.append(city);
        sb.append(", ");
        sb.append(state);
        sb.append(". ");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "suffix='" + suffix + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
