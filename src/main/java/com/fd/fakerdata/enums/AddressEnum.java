package com.fd.fakerdata.enums;

public enum AddressEnum {
    Code("id"), Name("name");

    private final String value;

    AddressEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
