package com.company.state;

public class DrivingMode implements TravellingMode {
    @Override
    public Object getDirection() {
        return "Direction from Driving";
    }

    @Override
    public Object getEta() {
        return "Eta from Driving";
    }
}
