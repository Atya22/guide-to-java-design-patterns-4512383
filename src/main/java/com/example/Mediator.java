package com.example;

public class Mediator {
    private final PedestrianCrossingLight pedestrianCrossingLight;
    private final TrafficLight trafficLight;

    public Mediator(PedestrianCrossingLight pedestrianCrossingLight, TrafficLight trafficLight) {
        this.pedestrianCrossingLight = pedestrianCrossingLight;
        this.trafficLight = trafficLight;
    }

    public void changeTrafficLightToRed() {
        trafficLight.changeToRed();
        pedestrianCrossingLight.changeToGreen();
    }


    public void changeTrafficLightToGreen() {
        trafficLight.changeToGreen();
        pedestrianCrossingLight.changeToRed();

    }

    public void changeTrafficLightToAmber() {
        trafficLight.changeToAmber();
    }
}
