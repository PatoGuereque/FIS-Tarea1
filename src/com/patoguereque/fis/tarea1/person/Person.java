package com.patoguereque.fis.tarea1.person;

public abstract class Person {

    public String firstName;
    public String lastName;
    public String birthData;

    public Person() {}

    public Person(String firstName, String lastName, String birthData) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthData = birthData;
    }

    public abstract void printPersonalInformation();
}
