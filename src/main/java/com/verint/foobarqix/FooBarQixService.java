package com.verint.foobarqix;

import org.springframework.stereotype.Service;

@Service
public class FooBarQixService {

    public String convert(Integer value) {
        String result = "";
        result += convertDivisibleBy(value);
        if (value.toString().contains("3")) {
            result += "Foo";
        }
        if (result.isEmpty()) {
            result = value.toString();
        }
        return result;
    }

    private String convertDivisibleBy(Integer value) {
        String result = "";
        if (value % 3 == 0) {
            result = "Foo";
        } else if (value % 5 == 0) {
            result = "Bar";
        } else if (value % 7 == 0) {
            result = "Qix";
        }
        return result;
    }
}
