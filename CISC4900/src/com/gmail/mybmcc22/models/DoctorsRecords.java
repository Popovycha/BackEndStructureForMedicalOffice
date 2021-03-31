package com.gmail.mybmcc22.models;

import com.gmail.mybmcc22.exceptions.DoctorNotFoundException;

import java.util.HashSet;

public class DoctorsRecords {
    private HashSet<Doctor> records;

    public DoctorsRecords(){
        records = new HashSet<>();
    }
    public void add(Doctor doctor) {
        records.add(doctor);
    }
    //FIND DOCTOR BY NAME
    public Doctor findByName(String name) throws DoctorNotFoundException {
        for (Doctor doctor : records) {
            if (doctor.getDoctorMailingAddress().equals(name)) {
                return doctor;
            }
        }
        throw new DoctorNotFoundException();

    }
    //FIND DOCTOR BY SPECIALITY
    public Doctor findBySpeciality(String speciality) throws DoctorNotFoundException {
        for (Doctor doctor : records) {
            if (doctor.getSpeciality().equals(speciality)) {
                return doctor;
            }
        }
        throw new DoctorNotFoundException();
    }
    //FIND DOCTOR BY STATE
    public Doctor findByState(String state) throws DoctorNotFoundException {
        for (Doctor doctor : records) {
            if (doctor.getState().equals(state)) {
                return doctor;
            }
        }
        throw new DoctorNotFoundException();
    }
    //FIND DOCTOR BY CITY
    public  Doctor findByCity(String city) throws DoctorNotFoundException {
        for (Doctor doctor : records) {
            if (doctor.getCity().equals(city)) {
                return doctor;
            }
        }
        throw new DoctorNotFoundException();
    }
    //FIND DOCTOR BY NPI (UNIQUE NUMBER)
    public Doctor findByNpi(String npi) throws  DoctorNotFoundException {
        for (Doctor doctor : records) {
            if (doctor.getNpi().equals(npi)) {
                return doctor;
            }
        }
        throw new DoctorNotFoundException();
    }
    public int getNumberOfDoctor(){
        return records.size();
    }

    public HashSet<Doctor> allDoctors() {
        return records;
    }
}
