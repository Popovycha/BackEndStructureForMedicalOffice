package com.gmail.mybmcc22.models;

import com.gmail.mybmcc22.exceptions.PatientNotFoundException;
import com.gmail.mybmcc22.utilities.GenderType;

import java.util.HashSet;

public class PatientsRecords {
    private HashSet<Patient> records;

    public PatientsRecords() {
        records = new HashSet<>();
    }

    public void add(Patient patient) {
        records.add(patient);
    }

    public Patient findByName(String name) throws PatientNotFoundException {
        for (Patient patient : records) {
            if (patient.getPatientFullName().equals(name)) {
                return patient;
            }
        }
        throw new PatientNotFoundException();
    }
    
    public Patient findByDOB(String DOB) throws PatientNotFoundException {
        for (Patient patient : records) {
            if (patient.getDOB().equals(DOB)) {
                return patient;
            }
        }
        throw new PatientNotFoundException();
    }
    
    public Patient findByState(String state) throws PatientNotFoundException {
        for (Patient patient : records) {
            if ( patient.getState().equals(state)) {
                return patient;
            }
        }
        throw new PatientNotFoundException();
    }
    
    public Patient findByCity(String city) throws PatientNotFoundException {
        for (Patient patient : records) {
            if ( patient.getCity().equals(city)) {
                return patient;
            }
        }
        throw new PatientNotFoundException();
    }
    
    public Patient findByCin(String cin) throws PatientNotFoundException {
        for (Patient patient : records) {
            if ( patient.getCin().equals(cin)) {
                return patient;
            }
        }
        throw new PatientNotFoundException();
    }

    public Patient findByAddress(String address) throws PatientNotFoundException {
        for (Patient patient : records) {
            if ( patient.getAddress().equals(address)) {
                return patient;
            }
        }
        throw new PatientNotFoundException();
    }

    public Patient findByPatientId(String patientId) throws PatientNotFoundException {
        for (Patient patient : records) {
            if ( patient.getPatientId().equals(patientId)) {
                return patient;
            }
        }
        throw new PatientNotFoundException();
    }
    
    public Patient findByGender(GenderType gender) throws PatientNotFoundException {
        for (Patient patient : records) {
            if ( patient.getGender().equals(gender)) {
                return patient;
            }
        }
        throw new PatientNotFoundException();
    }

    public int getNumberOfPatients(){
        return records.size();
    }

    public HashSet<Patient> allPatients(){
        return records;
    }
}
