package com.sda.pantry.model.storage;

public enum AmountType {
    LITER("L."),
    KILOGRAM("Kg"),
    GRAM("g"),
    PCS("pcs.");

    private final String shortName;

    AmountType(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
