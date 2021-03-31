package com.gmail.mybmcc22.ui;

import com.gmail.mybmcc22.models.Billing;
import com.gmail.mybmcc22.models.Doctor;
import com.gmail.mybmcc22.models.Patient;
import com.gmail.mybmcc22.utilities.GenderType;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Patient patient = new Patient("MR", "Michael", "Page", "01/02/2000","NY",
                "Brooklyn", "263 Hallbrook St", "3475693404", "mpage@gmail.com",
                "S4", "3456", GenderType.MALE );
        Doctor doctor = new Doctor("MD", "Richard", "Tollino", "32356334",
                "Primary Care", "rictollino32@gmail.com", "NY", "New York City",
                "312 Hoyt St");

        System.out.println(patient.getPatientFullName());
        System.out.println(patient.toString());
        System.out.println(patient.getPatientId());

        System.out.println(doctor.getDoctorFullName());
        System.out.println(doctor.getDoctorMailingAddress());






    }
}
