package org.iffat.stuctural_design.adapter;

public class BuggatiAdapter extends VehicleAdapter{
    public BuggatiAdapter() {
        super("Buggati");
    }

    @Override
    public int speedKMH() {
        return (int) (240 * 1.6);
    }
}
