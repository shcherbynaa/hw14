package com.hw14.patterns.abstractfactory;

public class AbstractFactory {
    Factory createFactory(String typeOfFactory) {
        switch (typeOfFactory) {
            case "Car":
                return new CarFactory();
            case "Motorcycle":
                return new MotorcycleFactory();
            default:
                return null;
        }
    }
}
