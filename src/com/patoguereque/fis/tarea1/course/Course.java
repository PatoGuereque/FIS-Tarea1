package com.patoguereque.fis.tarea1.course;

import com.patoguereque.fis.tarea1.person.Lecturer;
import com.patoguereque.fis.tarea1.person.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {

    public String title;
    public Lecturer lecturer;
    public final List<Date> dates = new ArrayList<>();
    public final List<Student> attendees = new ArrayList<>();

    public Course(String title) {
        this.title = title;
    }

    public void printCourseTitle() {
        System.out.println(title);
    }
}
