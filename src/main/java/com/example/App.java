package com.example;

public class App {

    public static void main(String[] args) {
        var context = "hello world.";
        System.out.println(context);
        var firstLetterShouldBeUpperCase = new FirstLetterShouldBeUpperCase();
        System.out.println(firstLetterShouldBeUpperCase.interpret(context));
    }

}
