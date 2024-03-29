package org.iffat.encapsulation;

public class Car {
    // attribute
    private float weight;
    private String color;

    // constructor
    public Car(float weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
