package com.patoguereque.fis.tarea1.course;

import com.patoguereque.fis.tarea1.person.Lecturer;
import com.patoguereque.fis.tarea1.person.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {

    private String title;
    private Lecturer lecturer;
    private final List<Date> dates = new ArrayList<>();
    private final List<Student> attendees = new ArrayList<>();

    public Course(String title) {
        this.title = title;
    }

    public void printCourseTitle() {
        System.out.println(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<Date> getDates() {
        return dates;
    }

    public List<Student> getAttendees() {
        return attendees;
    }
}
