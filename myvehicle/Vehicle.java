package com.example.myvehicle;

import androidx.annotation.NonNull;

/**
 * created by Leon Frempong on 09/10/19
 * @author Leon Frempong
 * @version 1.1
 */

public class Vehicle {
    public static int counter = 0;
    private String make;
    private int year;
    private String message;

//the default constructor
    public Vehicle() {
        this.make = "Volvo";
        this.year = 2012;
        this.message = "This is the default message.";
    }

/*
    this constructor takes no parameters
 */
    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
        this.message = "Your car is a " + make + " built in " + year + ".";
        count();
    }
    /**
     * The constructor that takes only the make of the car.
     * @param make the make of your car.
     */
    public Vehicle(String make) {
        this();
        this.make = make;
        message = "You didn't type in year value.";
        count();
    }

    @NonNull
    @Override
    public String toString() {
        return message;
    }

    public String getMessage() {
        return message;
    }

    private void count(){
        this.counter++;
    }

}
