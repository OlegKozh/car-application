package org.example;

import java.util.Arrays;
import java.util.List;

public class Car {

    private String engine;

    private List<String> wheels;

    private Integer currentSpeed = 0;

    private Double fuelConsumption = 0.0;

    private Integer currentGearBoxPosition = 1;

    private List<Lamp> lamps;

    public Car(String engine, List<String> wheels, List<Lamp> lamps) {
        this.engine = engine;
        this.wheels = wheels;
        this.lamps = lamps;
    }

    public void speedUp(Integer speedToIncrease) {
        currentSpeed = currentSpeed + speedToIncrease;
        fuelConsumption = fuelConsumption + speedToIncrease / 2;
        currentGearBoxPosition = currentGearBoxPosition + currentSpeed / 3;
        System.out.println("Increasing speed...");
    }

    public List<Lamp> snatchLamps() {
        return lamps;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }
}
