package com.verint.foobarqix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FooBarQixServiceTest {

    private FooBarQixService fooBarQixService;

    @BeforeEach
    void setUp() {
        fooBarQixService = new FooBarQixService();
    }

    @Test
    void shouldConvertOneToOne() {
        assertThat(fooBarQixService.convert("1"), is("1"));
    }

    @Test
    void shouldConvertTwoToTwo() {
        assertThat(fooBarQixService.convert("2"), is("2"));
    }
}
