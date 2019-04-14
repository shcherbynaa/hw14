package com.hw14.patterns.abstractfactory;

public class MotorcycleFactory implements Factory{
    public Motorcycle create(String typeOfMotorcycle) {
        switch (typeOfMotorcycle) {
            case "Honda":
                return new Honda();
            case "Harley":
                return new Harley();
            default:
                return null;
        }
    }
}
