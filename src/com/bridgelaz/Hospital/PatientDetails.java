package com.bridgelaz.Hospital;

public class PatientDetails {
   private String name;
  private   int age;
   private long phoneNumber;

   private Enum departMent;
  private   String patientName;
  private   String city;
  private   String state;

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

    public Enum getDepartMent() {
        return departMent;
    }

    public void setDepartMent(Enum departMent) {
        this.departMent = departMent;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
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

//    public PatientDetails(String name, int age, long phoneNumber, Enum departMent, String patientName, String city, String state) {
//        this.name = name;
//        this.age = age;
//        this.phoneNumber = phoneNumber;
//        this.departMent = departMent;
//        this.patientName = patientName;
//        this.city = city;
//        this.state = state;
//    }

    @Override
    public String toString() {
        return "PatientDetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", departMent=" + departMent +
                ", patientName='" + patientName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }


    }

