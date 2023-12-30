package com.mike.test;

public class Motorbike extends Vehicle{
    public Motorbike(){
        super(2, "Blue");
    }

    @Override
    public void activateBreaks() {
        System.out.println("Motorbike breaks");
    }
}
