package com.hw14.patterns.prototype;

public class Transaktion {
    private Money money;

    public Money getMoney() throws CloneNotSupportedException {
        return money.clone();
    }

    public void setMoney(Money money) {
        this.money = money;
    }
}
