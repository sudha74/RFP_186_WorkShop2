package com.bridgelaz.Hospital;

import java.util.Scanner;

public class Patient {
    private String name;
    private int age;
    private long phoneNumber;
    private String city;
    private String state;
    Department Department;

    public enum Department {
        ONCOLOGY, NEUROLOGY, CARDIOLOGY, GYNOCOLOGY;
    }

    Scanner scanner = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void selectDepartment() {
        System.out.println("Select Department:\n1.ONCOLOGY \n2.NEUROLOGY \n3.CARDIOLOGY \n4.GYNOCOLOGY ");
        byte option = scanner.nextByte();
        switch (option) {
            case 1:
                if (option == 1) {
                    System.out.println(this.Department = Department.ONCOLOGY);
                } else if (option == 2) {
                    System.out.println(this.Department = Department.NEUROLOGY);
                } else if (option == 3) {
                    System.out.println(this.Department = Department.CARDIOLOGY);
                } else if (option == 4) {
                    System.out.println(this.Department = Department.GYNOCOLOGY);
                } else {
                    System.out.println("Select Valid Option");
                    selectDepartment();
                }
        }
    }


    @Override
    public String toString() {
        return "PatientDetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", Department=" + Department +
                '}';
    }
}

