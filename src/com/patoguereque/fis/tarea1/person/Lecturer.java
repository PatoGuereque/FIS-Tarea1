package com.patoguereque.fis.tarea1.person;

import com.patoguereque.fis.tarea1.course.Course;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends Person {

    private final List<Course> courseList = new ArrayList<>();
    private int employeeID;

    public Lecturer(String firstName, String lastName, String birthData) {
        super(firstName, lastName, birthData);
    }

    @Override
    public void printPersonalInformation() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthData='" + birthData + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
