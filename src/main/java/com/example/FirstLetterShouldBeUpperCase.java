package com.example;

import java.util.Locale;

public class FirstLetterShouldBeUpperCase implements Expression {
    private final ShouldEndWithPeriod shouldEndWithPeriod = new ShouldEndWithPeriod();

    @Override
    public String interpret(String context) {
        context = context.substring(0, 1).toUpperCase() + context.substring(1);
        return shouldEndWithPeriod.interpret(context);
    }
}

