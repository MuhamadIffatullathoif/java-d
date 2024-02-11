package org.iffat.stuctural_design.adapter;

public class Porche extends Vehicle {
    public Porche(String brand) {
        super("Porche");
    }

    @Override
    int getSpeedMph() {
        return 220;
    }
}
