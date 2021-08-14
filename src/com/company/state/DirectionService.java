package com.company.state;

public class DirectionService {

    public TravellingMode getTravellingMode() {
        return travellingMode;
    }

    public void setTravellingMode(TravellingMode travellingMode) {
        this.travellingMode = travellingMode;
    }

    private TravellingMode travellingMode;

    public DirectionService(TravellingMode travellingMode) {
        this.travellingMode = travellingMode;
    }

    public Object getEta() {
      return travellingMode.getEta();
    }

    public Object getDirection() {
        return travellingMode.getDirection();
    }
}
