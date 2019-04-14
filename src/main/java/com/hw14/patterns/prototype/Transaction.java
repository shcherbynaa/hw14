package com.hw14.patterns.prototype;

public class Transaction {
    private Money money;

    public Money getMoney() throws CloneNotSupportedException {
        return money.clone();
    }

    public void setMoney(Money money) {
        this.money = money;
    }
}
