package com.hw14.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class GroupOfCar {
    private Map<String, Car> map = new HashMap<String, Car>();

    Car getCar(String model) {
        Car car = map.get(model);
        if (car == null) {
            car = new Car();
            car.model = model;
            map.put(model, car);
        }
        return car;
    }
}
