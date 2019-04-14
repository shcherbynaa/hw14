package com.hw14.patterns.prototype;

public class Money implements Cloneable {
    public Money clone() throws CloneNotSupportedException {
        return (Money) super.clone();
    }
}
