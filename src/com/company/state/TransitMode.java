package com.company.state;

public class TransitMode implements TravellingMode{
    @Override
    public Object getDirection() {
        return "Direction from Transit";
    }

    @Override
    public Object getEta() {
        return "Eta from Transit";
    }
}
