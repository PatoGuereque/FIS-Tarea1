package com.patoguereque.fis.tarea1.person;

public abstract class Person {

    String firstName;
    String lastName;
    String birthData;

    Person() {}

    Person(String firstName, String lastName, String birthData) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthData = birthData;
    }

    public abstract void printPersonalInformation();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthData() {
        return birthData;
    }

    public void setBirthData(String birthData) {
        this.birthData = birthData;
    }
}
