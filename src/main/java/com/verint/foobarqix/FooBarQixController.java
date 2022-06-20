package com.verint.foobarqix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooBarQixController {

    private final FooBarQixService fooBarQixService;

    @Autowired
    public FooBarQixController(FooBarQixService fooBarQixService) {
        this.fooBarQixService = fooBarQixService;
    }

    @PostMapping(path = "/foobarqix")
    public String post(@RequestParam("value") String value){
        return fooBarQixService.convert(value);
    }
}
