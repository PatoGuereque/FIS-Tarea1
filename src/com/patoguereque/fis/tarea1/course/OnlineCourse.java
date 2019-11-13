package com.patoguereque.fis.tarea1.course;

import java.net.URL;

public class OnlineCourse extends Course {

    private URL url;

    public OnlineCourse(String title, URL url) {
        super(title);
        this.url = url;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}
