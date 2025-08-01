package com.example;

public class App {

    public static void main(String[] args) {
        var light = new Light();
        var lightCommandExecutor = new LightCommandExecutor();
        light.isOn();
//        light.turnOnLight();
        lightCommandExecutor.execute(new TurnOnLightCommand(light));
        light.isOn();
//        light.turnOffLight();
        lightCommandExecutor.execute(new TurnOffLightCommand(light));
        light.isOn();
    }

}
