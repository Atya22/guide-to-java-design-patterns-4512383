package com.example;

public class App {
    private static FactoryMaker factoryMaker;

    public static void main(String[] args) {
        UserInterface roadUserInterface = createUserInterface("RED");
        UserInterface mountainUserInterface = createUserInterface("BLUE");

        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);

    }

    private static UserInterface createUserInterface(String color) {
        var userInterfaceFactory = FactoryMaker.resolveFactory(color);
        var button = userInterfaceFactory.createButton();
        var scrollerBar = userInterfaceFactory.createScrollBar();
        return new UserInterface(button, scrollerBar);
    }

}

