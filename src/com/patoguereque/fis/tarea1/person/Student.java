package com.patoguereque.fis.tarea1.person;

import com.patoguereque.fis.tarea1.course.Course;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    public String majorSubject;
    public String minorSubject;
    public final List<Course> courseList = new ArrayList<>();
    public int studentId;

    public Student(String firstName, String lastName, String birthData, String majorSubject, String minorSubject) {
        super(firstName, lastName, birthData);
        this.majorSubject = majorSubject;
        this.minorSubject = minorSubject;
    }

    @Override
    public void printPersonalInformation() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthData='" + birthData + '\'' +
                ", studentId=" + studentId + '\'' +
                '}';
    }
}
