package com.hw14.patterns.fabricmethod.Builder;

public class LessonBuilder {
     String name;
     int classRoom;

     LessonBuilder buildName(String name) {
        this.name = name;
        return this;
    }

     LessonBuilder buildClassRoom(int classRoom) {
        this.classRoom = classRoom;
        return this;
    }

     Lesson build() {
        Lesson lesson = new Lesson();
        lesson.setName(name);
        lesson.setNumClassRoom(classRoom);
        return lesson;
    }
}

