package com.patoguereque.fis.tarea1.course;

import java.net.URL;

public class OnlineCourse extends Course {

    public URL url;

    public OnlineCourse(String title, URL url) {
        super(title);
        this.url = url;
    }
}
