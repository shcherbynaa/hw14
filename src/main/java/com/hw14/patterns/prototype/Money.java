package com.hw14.patterns.prototype;

public class Money implements Cloneable {
    @Override
    public Money clone() throws CloneNotSupportedException {
        return (Money) super.clone();
    }
}
