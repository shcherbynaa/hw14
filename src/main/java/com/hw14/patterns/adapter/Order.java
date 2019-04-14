package com.hw14.patterns.adapter;

public class Order implements Cafe {
    @Override
    public void getOrder() {
        System.out.println("Order");
    }
}
