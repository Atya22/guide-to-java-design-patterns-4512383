package com.example;

public class ShouldEndWithPeriod implements Expression {
    @Override
    public String interpret(String context) {
        if (!(context.endsWith("."))) {
            return context.concat(".");
        }
        return context;
    }
}
