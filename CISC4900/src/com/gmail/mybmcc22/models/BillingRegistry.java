package com.gmail.mybmcc22.models;

import com.gmail.mybmcc22.exceptions.BillAlreadyExistsException;
import com.gmail.mybmcc22.exceptions.BillNotFoundException;
import com.gmail.mybmcc22.utilities.BillingStatus;

import java.util.ArrayList;

public class BillingRegistry {
    private ArrayList<Billing> registry;

    public BillingRegistry() {
        registry = new ArrayList<Billing>();
    }

    public void  addBill(Billing billing) throws BillAlreadyExistsException {
        if (registry.contains(billing)) //matched with billing that were passed in
        {
            throw new BillAlreadyExistsException();
        }
        registry.add(billing);
    }

    public Billing findBill(String patientId) throws BillNotFoundException {
        for (Billing billing : registry) {
            if (billing.getPatient().equals(patientId) && billing.getStatus() == BillingStatus.CURRENT) {
                return billing;
            }
        }
        throw new BillNotFoundException();
    }

    public boolean isBillUnpaid(String patientId) {

        try {
            Billing foundBill = findBill(patientId);
            return true;
        }
        catch (BillNotFoundException e) {
            return false;
        }
    }
}
