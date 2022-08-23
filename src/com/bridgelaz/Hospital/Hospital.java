package com.bridgelaz.Hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hospital {

    String hospitalName;
    static HashMap<String, Hospital> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Patient> list = new ArrayList<>();


    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    static Hospital createNewHospital(String hospitalName) {
        Hospital hospital = new Hospital(hospitalName);
        map.put(hospitalName, hospital);
        return hospital;
    }

    public <patient> patient getUserInput() {
        Patient patient = new Patient();
        System.out.println("Enter Department");
        String Department = scanner.next();
        patient.selectDepartment();
        System.out.println("Enter Name");
        patient.setName(scanner.next());
        System.out.println("Enter age");
        patient.setAge(scanner.nextInt());
        System.out.println("Enter phoneNumber");
        patient.setPhoneNumber(scanner.nextLong());
        System.out.println("Enter city");
        patient.setCity(scanner.next());
        System.out.println("Enter state");
        patient.setState(scanner.next());
        return (patient) patient;
    }

    public void addPatient() {
        Patient patient = getUserInput();
        list.add(patient);
        System.out.println(patient);
        System.out.println("Patient Updated Successfully");
    }
}




