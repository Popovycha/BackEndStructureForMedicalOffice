package com.gmail.mybmcc22.models;

public class Appointment {
    String dateOfService;
    String timeOfService;
    String addressOfService;
    double  npi;
    double  cin;
    String status;
    static String[] statusValue = { "Accepted", "Declined" ,"Pending"};

    public  Appointment( String dateOfService, String timeOfService,String addressOfService, double npi, double cin) {
        this.dateOfService = dateOfService;
        this.timeOfService = timeOfService;
        this.addressOfService = addressOfService;
        this.npi = npi;
        this.cin = cin;
        this.status = statusValue[2];
    }

    public String getDateOfService() {
        return dateOfService;
    }

    public void setDateOfService(String dateOfService) {
        this.dateOfService = dateOfService;
    }

    public String getTimeOfService() {
        return timeOfService;
    }

    public void setTimeOfService(String timeOfService) {
        this.timeOfService = timeOfService;
    }

    public String getAddressOfService() {
        return addressOfService;
    }

    public void setAddressOfService(String addressOfService) {
        this.addressOfService = addressOfService;
    }

    public double getNpi() {
        return npi;
    }

    public void setNpi(int npi) {
        this.npi = npi;
    }

    public double getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public static String[] getStatus() {
        return statusValue;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatusAccepted() {
        this.status = statusValue[0];
    }

    public void setStatusDeclined() {
        this.status = statusValue[1];
    }
}
