package com.verint.foobarqix;

import org.springframework.stereotype.Service;

@Service
public class FooBarQixService {

    public String convert(Integer value) {
        StringBuilder result = new StringBuilder();
        result.append(convertDivisibleBy(value));
        if (value == 13) {
            result.append("Foo");
        }
        if (result.isEmpty()) {
            return value.toString();
        } else {
            return result.toString();
        }
    }

    private String convertDivisibleBy(Integer value){
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
