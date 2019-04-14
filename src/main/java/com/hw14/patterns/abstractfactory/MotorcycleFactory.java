package com.hw14.patterns.abstractfactory;

public class MotorcycleFactory implements Factory {
    private static final String HONDA = "Honda";
    private static final String HARLEY = "Harley";

    public Motorcycle create(String typeOfMotorcycle) {
        Motorcycle motorcycle = null;
        if (typeOfMotorcycle != null) {
            switch (typeOfMotorcycle) {
                case HONDA:
                    return new Honda();
                case HARLEY:
                    return new Harley();
                default:
                    return null;
            }
        }
        return motorcycle;
    }
}
