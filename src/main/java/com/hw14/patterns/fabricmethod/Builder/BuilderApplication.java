package com.hw14.patterns.fabricmethod.Builder;

public class BuilderApplication {
    public static void main(String[] args) {
        Lesson lesson = new LessonBuilder()
                .buildName("Math")
                .buildClassRoom(2)
                .build();
    }

}
