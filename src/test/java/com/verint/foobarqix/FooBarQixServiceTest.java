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
        assertThat(fooBarQixService.convert(1), is("1"));
    }

    @Test
    void shouldConvertTwoToTwo() {
        assertThat(fooBarQixService.convert(2), is("2"));
    }

    @Test
    void shouldConvertSixToFoo() {
        assertThat(fooBarQixService.convert(6), is("Foo"));
    }

    @Test
    void shouldConvertNineToFoo() {
        assertThat(fooBarQixService.convert(9), is("Foo"));
    }

    @Test
    void shouldConvertTenToBar() {
        assertThat(fooBarQixService.convert(10), is("Bar"));
    }

    @Test
    void shouldConvertTwentyToBar() {
        assertThat(fooBarQixService.convert(20), is("Bar"));
    }

    @Test
    void shouldConvertFourteenToQix() { assertThat(fooBarQixService.convert(14), is("Qix"));}

    @Test
    void shouldConvertTwentyEightToQix() {
        assertThat(fooBarQixService.convert(28), is("Qix"));
    }
}
