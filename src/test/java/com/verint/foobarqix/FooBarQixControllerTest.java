package com.verint.foobarqix;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(FooBarQixController.class)
public class FooBarQixControllerTest {
    @Autowired
    private MockMvc mockMvc;

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

}
