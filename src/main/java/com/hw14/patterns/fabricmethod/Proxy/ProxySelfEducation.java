package com.hw14.patterns.fabricmethod.Proxy;

import com.hw14.patterns.fabricmethod.Course;

public class ProxySelfEducation implements Course {
    Course course;

    public ProxySelfEducation(Course course) {
        course = new SelfEducation();
    }

    @Override
    public void showCourse() {
        System.out.println("proxy");
        course.showCourse();
    }
}
