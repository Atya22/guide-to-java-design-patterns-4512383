package com.example;

public enum Logger {
    INSTANCE;

    public static Logger getINSTANCE() {
        return INSTANCE;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }

}
