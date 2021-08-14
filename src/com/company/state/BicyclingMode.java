package com.company.state;

public class BicyclingMode implements TravellingMode{
    @Override
    public Object getDirection() {
        return "Direction from Bicycle";
    }

    @Override
    public Object getEta() {
        return "Eta from Bicycle";
    }
}
