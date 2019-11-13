package com.patoguereque.fis.tarea1;

import com.patoguereque.fis.tarea1.course.Course;
import com.patoguereque.fis.tarea1.course.LectureCourse;
import com.patoguereque.fis.tarea1.course.OnlineCourse;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    private final static DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-mm-dd HH:MM");

    public Main() throws MalformedURLException, ParseException {
        Course course = new Course("SEECx");
        course.dates.add(DATE_FORMAT.parse("2017-05-30 12:00"));
        course.printCourseTitle();

        LectureCourse lectureCourse = new LectureCourse("POM", new Point(100, 70));
        lectureCourse.printCourseTitle();

        OnlineCourse onlineCourse = new OnlineCourse("SEECx", new URL("https://www.edx.org/course/software-engineering-essentials-tumx-seecx"));
        onlineCourse.printCourseTitle();
    }

    public static void main(String[] args) {
        try {
            new Main();
        } catch (MalformedURLException | ParseException e) {
            System.err.println("Unable to instantiate main class!");
            e.printStackTrace();
        }
    }
}
