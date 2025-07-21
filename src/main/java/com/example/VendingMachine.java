package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {
    private static final Map<String, Supplier<Snack>> snackMap = new HashMap<>();

    static {
        snackMap.put("chips", Chips::new);
        snackMap.put("drink", Drink::new);
        snackMap.put("chocolate bar", ChocolateBar::new);

    }

    Snack getSnack(String snackType) {
        var lowerCaseSnack = snackType.toLowerCase();
        var snackSupplier = snackMap.get(lowerCaseSnack);
        if (snackSupplier != null) {
            return snackSupplier.get();
        } else {
            throw new IllegalArgumentException("Invalid snack type");
        }
    }
}
