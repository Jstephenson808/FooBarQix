package com.verint.foobarqix;

import org.springframework.stereotype.Service;

@Service
public class FooBarQixService {

    public String convert(Integer value) {
        String result;
        if (value % 3 == 0) {
            result = "Foo";
        } else {
            result = value.toString();
        }
        return result;
    }

}
