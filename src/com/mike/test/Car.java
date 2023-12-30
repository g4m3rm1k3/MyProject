package com.mike.test;

public class Car extends Vehicle{
    public Car(){
        super(4, "black");

    }

    @Override
    public void activateBreaks() {
        System.out.println("Car breaks");
    }
}
