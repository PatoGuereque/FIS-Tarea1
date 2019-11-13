package com.patoguereque.fis.tarea1.course;

import java.awt.*;

public class LectureCourse extends Course {

    private Point location;

    public LectureCourse(String title, Point location) {
        super(title);
        this.location = location;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}
