package com.patoguereque.fis.tarea1.course;

import java.awt.*;

public class LectureCourse extends Course {

    public Point location;

    public LectureCourse(String title, Point location) {
        super(title);
        this.location = location;
    }
}
