package com.company.state;

public class WalkingMode implements TravellingMode {
    @Override
    public Object getDirection() {
        return "Direction from Walking";
    }

    @Override
    public Object getEta() {
        return "Eta from Walking";
    }
}
