package com.hw14.patterns.fabricmethod.Singleton;

public class Singleton {

    public static Singleton instance = null;

    private Singleton() {};

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
