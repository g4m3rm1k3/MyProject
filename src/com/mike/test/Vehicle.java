package com.mike.test;

public abstract class Vehicle {
    private int wheels;
    private String color;

    public Vehicle(int wheels, String color) {
        this.color = color;
        this.wheels = wheels;

    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public abstract void activateBreaks();


}
