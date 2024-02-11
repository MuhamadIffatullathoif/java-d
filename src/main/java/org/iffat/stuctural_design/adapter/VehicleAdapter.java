package org.iffat.stuctural_design.adapter;

public abstract class VehicleAdapter extends Vehicle implements AdapterService {

    public VehicleAdapter(String brand) {
        super(brand);
    }

    @Override
    int getSpeedMph() {
        return speedKMH();
    }

    @Override
    public String toString() {
        return brand + " : " + getSpeedMph() + " KMH";
    }
}
