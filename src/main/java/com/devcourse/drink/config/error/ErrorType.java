package com.devcourse.drink.config.error;

import java.util.function.Supplier;

public enum ErrorType {
    PRICE_NEGATIVE_VALUE(ErrorProperties::getPriceNegativeValue);

    private Supplier<String> error;

    ErrorType(Supplier<String> error) {
        this.error = error;
    }

    public String message() {
        return error.get();
    }
}