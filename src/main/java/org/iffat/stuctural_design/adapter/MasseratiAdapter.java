package org.iffat.stuctural_design.adapter;

public class MasseratiAdapter extends VehicleAdapter{
    public MasseratiAdapter() {
        super("Masserati");
    }

    @Override
    public int speedKMH() {
        return (int) (200 * 1.6);
    }
}
