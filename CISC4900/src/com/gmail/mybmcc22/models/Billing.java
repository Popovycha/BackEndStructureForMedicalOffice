package com.gmail.mybmcc22.models;

import com.gmail.mybmcc22.utilities.BillingStatus;

import java.util.Date;
import java.util.GregorianCalendar;

public class Billing {
    private int ID;
    private Patient patient;
    private OfficeVisit officeVisit;
    private Date startDate;
    private Date dueDate;
    private Date dateOfPayment;
    private BillingStatus status;

    public Billing(int ID, Patient patient, OfficeVisit officeVisit) {
        this.ID = ID;
        this.patient = patient;
        this.officeVisit = officeVisit;
        startDate = new Date();

        GregorianCalendar gCal = new GregorianCalendar();
        gCal.add(GregorianCalendar.DAY_OF_MONTH, 21);
        this.dueDate = gCal.getTime();

        status = BillingStatus.CURRENT;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public OfficeVisit getOfficeVisit() {
        return officeVisit;
    }

    public void setOfficeVisit(OfficeVisit officeVisit) {
        this.officeVisit = officeVisit;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public BillingStatus getStatus() {
        return status;
    }

    public void setStatus(BillingStatus status) {
        this.status = status;
    }

    public void endBilling() {
        dateOfPayment = new Date();
        status = BillingStatus.HISTORIC;
    }
}
