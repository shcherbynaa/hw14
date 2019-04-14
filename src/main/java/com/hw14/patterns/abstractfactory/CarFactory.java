package com.hw14.patterns.abstractfactory;

public class CarFactory implements Factory {
    private static final String BMV = "Bmv";
    private static final String MERCEDES = "Mercedes";

    public Car createCar(String typeOfCar) {
        Car car = null;
        if (typeOfCar != null) {
            switch (typeOfCar) {
                case BMV:
                    return new Bmv();
                case MERCEDES:
                    return new Mercedes();
                default:
                    return null;
            }
        }
        return car;
    }
}
