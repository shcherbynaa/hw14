package com.hw14.patterns.fabricmethod.Proxy;

import com.hw14.patterns.fabricmethod.Course;

public class SelfEducation implements Course {
    @Override
    public void showCourse() {
        System.out.println("Self education");
    }
}
