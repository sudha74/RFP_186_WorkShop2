package com.bridgelaz.Hospital;

import java.util.HashMap;
import java.util.Scanner;

public class HospitalMain {
    public static void main(String[] args) {
        HashMap<String, PatientDetails> map=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        boolean exit=true;
        while (exit){
            PatientDetails pd=new PatientDetails();
            System.out.println("Enter the Hospital Name");
            String hospitalName=scanner.next().toLowerCase();
            if (map.containsKey(hospitalName)){
                System.out.println("Hospital already exist");
            }else {
                map.put(hospitalName,pd);
            }
        }
    }
}
