package com.hw14.patterns.abstractfactory;

public class CarFactory implements Factory {
    public Car createCar(String typeOfCar) {
        switch (typeOfCar) {
            case "Bmv":
                return new Bmv();
            case "Mercedes":
                return new Mercedes();
            default:
                return null;
        }
    }
}
