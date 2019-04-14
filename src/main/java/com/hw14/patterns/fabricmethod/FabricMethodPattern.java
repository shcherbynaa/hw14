package com.hw14.patterns.fabricmethod;

import com.hw14.patterns.fabricmethod.Builder.Lesson;
import com.hw14.patterns.fabricmethod.Proxy.Education;
import com.hw14.patterns.fabricmethod.Proxy.ProxySelfEducation;
import com.hw14.patterns.fabricmethod.Singleton.Singleton;

public class FabricMethodPattern {
    public Course create(String typeOfLesson) {
        switch (typeOfLesson) {
            case "Lesson":
                return new Lesson();
            case "ProxySelfEducation":
                return new ProxySelfEducation();
            case "Singleton":
                Singleton.getInstance();
            default:
                return null;
        }
    }
}
