package com.hw14.patterns.fabricmethod;

import com.hw14.patterns.fabricmethod.Builder.Lesson;
import com.hw14.patterns.fabricmethod.Proxy.Education;
import com.hw14.patterns.fabricmethod.Proxy.ProxySelfEducation;
import com.hw14.patterns.fabricmethod.Singleton.Singleton;

public class FabricMethodPattern {
    private static final String LESSON = "Lesson";
    private static final String PROXY_SELF_EDUCATION = "ProxySelfEducation";
    private static final String SINGLETON = "Singleton";

    public Course create(String typeOfLesson) {
        Course course = null;
        if (typeOfLesson != null) {
            switch (typeOfLesson) {
                case LESSON:
                    return new Lesson();
                case PROXY_SELF_EDUCATION:
                    return new ProxySelfEducation();
                case SINGLETON:
                    Singleton.getInstance();
                default:
                    return null;
            }
        }
        return course;
    }
}
