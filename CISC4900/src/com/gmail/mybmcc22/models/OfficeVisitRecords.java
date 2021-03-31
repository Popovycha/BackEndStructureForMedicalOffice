package com.gmail.mybmcc22.models;

import com.gmail.mybmcc22.exceptions.OfficeVisitNotFoundException;

import java.util.HashSet;
//implemented 02/27/21
public class OfficeVisitRecords {
    private HashSet<OfficeVisit> records;

    public OfficeVisitRecords() {
        records = new HashSet<>();
    }

    public OfficeVisit findByDoctorName(String doctorName) throws OfficeVisitNotFoundException {
        for (OfficeVisit officeVisit : records) {
            if (officeVisit.getDoctorName().equals(doctorName)) {
                return officeVisit;
            }
        }
        throw new OfficeVisitNotFoundException();
    }

    public OfficeVisit findByDoctorEmail(String doctorEmail) throws OfficeVisitNotFoundException {
        for (OfficeVisit officeVisit : records) {
            if (officeVisit.getDoctorEmail().equals(doctorEmail)) {
                return officeVisit;
            }
        }
        throw new OfficeVisitNotFoundException();
    }

    public OfficeVisit findByPatientEmail(String patientEmail) throws OfficeVisitNotFoundException {
        for (OfficeVisit officeVisit : records) {
            if (officeVisit.getPatientEmail().equals(patientEmail)) {
                return officeVisit;
            }
        }
        throw new OfficeVisitNotFoundException();
    }
    //FIND OFFICE VISIT BY DATE OF SERVICE
    public OfficeVisit findByDOS(String DOS) throws OfficeVisitNotFoundException {
        for (OfficeVisit officeVisit : records) {
            if (officeVisit.getDOS().equals(DOS)) {
                return officeVisit;
            }
        }
        throw new OfficeVisitNotFoundException();
    }
    //FIND OFFICE VISIT BY REASON OF SERVICE
    public OfficeVisit findByReasonOfService(String reasonOfService) throws OfficeVisitNotFoundException {
        for (OfficeVisit officeVisit : records) {
            if (officeVisit.getReasonOfService().equals(reasonOfService)) {
                return officeVisit;
            }
        }
        throw new OfficeVisitNotFoundException();
    }

    public OfficeVisit findByNpi(String npi) throws OfficeVisitNotFoundException {
        for (OfficeVisit officeVisit : records) {
            if (officeVisit.getNpi().equals(npi)) {
                return officeVisit;
            }
        }
        throw new OfficeVisitNotFoundException();
    }

    public OfficeVisit findByCin(String cin) throws OfficeVisitNotFoundException {
        for (OfficeVisit officeVisit : records) {
            if (officeVisit.getCin().equals(cin)) {
                return officeVisit;
            }
        }
        throw new OfficeVisitNotFoundException();
    }

    public OfficeVisit findByPrescription(String prescription) throws OfficeVisitNotFoundException {
        for (OfficeVisit officeVisit : records) {
            if (officeVisit.getPrescription().equals(prescription)) {
                return officeVisit;
            }
        }
        throw new OfficeVisitNotFoundException();
    }

    public OfficeVisit findByPrice(String price) throws OfficeVisitNotFoundException {
        for (OfficeVisit officeVisit : records) {
            if (officeVisit.getPrice().equals(price)) {
                return officeVisit;
            }
        }
        throw new OfficeVisitNotFoundException();
    }

    public int getNumberOfService() {
        return records.size();
    }

    public HashSet<OfficeVisit> allOfficeVisits() {
        return records;
    }
}
