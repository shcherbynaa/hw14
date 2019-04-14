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

    public static class LessonBuilder {
        private String name;
        private int classroom;

        public LessonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public LessonBuilder setClassRoom(int classRoom) {
            this.classroom = classRoom;
            return this;
        }

        Lesson build() {
            Lesson lesson = new Lesson();
            lesson.setName(name);
            lesson.setNumClassRoom(classroom);
            return lesson;
        }
    }
}
