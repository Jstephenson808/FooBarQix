package com.verint.foobarqix;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(FooBarQixController.class)
class FooBarQixControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FooBarQixService fooBarQixService;

    @Test
    void shouldBeOneWhenInputIsOne() throws Exception {
        mockMvc.perform(post("/foobarqix").param("value", "1"))
                .andExpect(status().isOk())
                .andExpect(content().string("1"));
    }

    @Test
    void shouldBeTwoWhenInputIsTwo() throws Exception{
        mockMvc.perform(post("/foobarqix").param("value", "2"))
                .andExpect(status().isOk())
                .andExpect(content().string("2"));
    }

    @Test
    void shouldInvokeServiceWithSuppliedValue() throws Exception {
        mockMvc.perform(post("/foobarqix").param("value", "1"));

        verify(fooBarQixService).convert("1");
    }

}
