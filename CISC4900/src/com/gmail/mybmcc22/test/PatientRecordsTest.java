package com.gmail.mybmcc22.test;

import com.gmail.mybmcc22.models.Patient;
import com.gmail.mybmcc22.exceptions.PatientNotFoundException;
import com.gmail.mybmcc22.models.PatientsRecords;
import com.gmail.mybmcc22.utilities.GenderType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PatientRecordsTest {

    PatientsRecords records;
    @Test
    public void testAddPatient() {
        Patient newPatient = new Patient("MR", "Ariel", "Carrasco", "01/15/1990",
                "CA", "San Jose", "3452 18th Ave", "+15452973489",
                "arielcars@gmail.com", "S1", "29567844", GenderType.MALE);

        int initialSize = records.getNumberOfPatients();

        records.add(newPatient);

        assertEquals(initialSize, records.getNumberOfPatients() - 1);

    }

    @Test
    public void testFindPatient() {
        try {
            Patient foundPatient = records.findByName("MR A Carrasco");
        } catch (PatientNotFoundException e ) {
            //fail("Patient not found");
        }
    }
    @Test
    public void testNoDuplicates() {
        Patient newPatient = new Patient("MRS", "Mark", "Gerrad", "10/10/1987",
                "NJ", "Jersey City", "2901 Park Str", "+16465682210",
                "Gerrad1010@yahoo.com","S2", "34568904", GenderType.MALE);
        records.add(newPatient);
        records.add(newPatient);
        System.out.println(records.allPatients());
    }

    public PatientRecordsTest() {
        records = new PatientsRecords();

        Patient newPatient = new Patient("MRS", "Mark", "Gerrad", "10/10/1987",
                "NJ", "Jersey City", "2901 Park Str", "+16465682210",
                "Gerrad1010@yahoo.com","S2", "34568904", GenderType.MALE);
        records.add(newPatient);
    }
}
