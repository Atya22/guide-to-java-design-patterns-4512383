package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {
    private static Map<String, Supplier<UserInterfaceFactory>> userInterfaces = new HashMap<>();

    static {
        userInterfaces.put("RED", RedUserInterface::new);
        userInterfaces.put("BLUE", BlueUserInterface::new);
    }

    public static UserInterfaceFactory resolveFactory(String interfaceColor) {
        var interfaceFactorySupplier = userInterfaces.get(interfaceColor);
        if (interfaceFactorySupplier != null) {
            return interfaceFactorySupplier.get();
        }
        throw new IllegalArgumentException("Invalid interface color");
    }
}
