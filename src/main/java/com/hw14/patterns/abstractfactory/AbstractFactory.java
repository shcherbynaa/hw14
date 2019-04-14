package com.hw14.patterns.abstractfactory;

public class AbstractFactory {

    private static final String CAR = "Car";
    private static final String MOTORCYCLE = "Motorcycle";

    public Factory createFactory(String typeOfFactory) {
        Factory factory = null;
        if (typeOfFactory != null) {
            switch (typeOfFactory) {
                case CAR:
                    return new CarFactory();
                case MOTORCYCLE:
                    return new MotorcycleFactory();
                default:
                    return null;
            }
        }
        return factory;
    }
}
