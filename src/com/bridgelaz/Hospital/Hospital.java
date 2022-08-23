package com.bridgelaz.Hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    enum HospitalName{

    }
    ArrayList<PatientDetails>list=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

    @Override
    public String toString() {
        return "Hospital{" +
                "list=" + list +
                '}';
    }
    void addOncology(){
        PatientDetails patientDetails=new PatientDetails();
        System.out.println("Enter name");
       patientDetails.setName(scanner.next());
        System.out.println("Enter age");
        patientDetails.setAge(scanner.nextInt());
        System.out.println("Enter phoneNumber");
        patientDetails.setPhoneNumber(scanner.nextLong());
        System.out.println("Enter PatientNmae");
        patientDetails.setPatientName(scanner.next());
        System.out.println("Enter city");
        patientDetails.setCity(scanner.next());
        System.out.println("Enter state");
        patientDetails.setState(scanner.next());
       list.add(patientDetails);
    }
}
