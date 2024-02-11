package org.iffat.stuctural_design.adapter;

public abstract class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract int getSpeedMph();

    @Override
    public String toString() {
        return brand + " : " + getSpeedMph() + " MPH";
    }
}
