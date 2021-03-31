package com.gmail.mybmcc22.models;

public class OfficeVisit {
    String doctorName;
    String doctorEmail;
    String patientEmail;
    String npi; //DOCTOR'S UNIQUE NUMBER - PRIMARY KEY
    String cin; //PATIENT'S UNIQUE NUMBER - PRIMARY KEY
    String reasonOfService;
    String DOS;
    String price;
    String prescription;

    public OfficeVisit(String doctorName, String doctorEmail, String patientEmail, String npi, String cin,
                       String reasonOfService, String DOS, String price, String prescription) {
        this.doctorName = doctorName;
        this.doctorEmail = doctorEmail;
        this.patientEmail = patientEmail;
        this.npi = npi;
        this.cin = cin;
        this.reasonOfService = reasonOfService;
        this.DOS = DOS;
        this.price = price;
        this.prescription = prescription;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getReasonOfService() {
        return reasonOfService;
    }

    public void setReasonOfService(String reasonOfService) {
        this.reasonOfService = reasonOfService;
    }

    public String getDOS() {
        return DOS;
    }

    public void setDOS(String DOS) {
        this.DOS = DOS;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getNpi() {
        return npi;
    }

    public void setNpi(String npi) {
        this.npi = npi;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}
