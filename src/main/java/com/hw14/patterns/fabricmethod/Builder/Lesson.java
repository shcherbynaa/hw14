package com.hw14.patterns.fabricmethod.Builder;

import com.hw14.patterns.fabricmethod.Course;

public class Lesson implements Course {
    public String name;
    public int numClassRoom;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumClassRoom(int numClassRoom) {
        this.numClassRoom = numClassRoom;
    }

    @Override
    public void showCourse() {
        System.out.println("Lesson");
    }
}
