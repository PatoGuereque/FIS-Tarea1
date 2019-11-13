package com.patoguereque.fis.tarea1.person;

import com.patoguereque.fis.tarea1.course.Course;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private String majorSubject;
    private String minorSubject;
    private final List<Course> courseList = new ArrayList<>();
    private int studentId;

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

    public String getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(String majorSubject) {
        this.majorSubject = majorSubject;
    }

    public String getMinorSubject() {
        return minorSubject;
    }

    public void setMinorSubject(String minorSubject) {
        this.minorSubject = minorSubject;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
