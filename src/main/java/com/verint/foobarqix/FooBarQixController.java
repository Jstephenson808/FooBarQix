package com.verint.foobarqix;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooBarQixController {


    @PostMapping(path = "/foobarqix")
    public String post(@RequestParam("value") String value){

        return value;
    }
}
