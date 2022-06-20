package com.verint.foobarqix;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(FooBarQixController.class)
class FooBarQixControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FooBarQixService fooBarQixService;

    @Test
    void shouldInvokeServiceWithSuppliedValue() throws Exception {
        mockMvc.perform(post("/foobarqix").param("value", "1"));

        verify(fooBarQixService).convert(1);
    }

    @Test
    void shouldReturnTheConversionFromTheService() throws Exception {
        when(fooBarQixService.convert(6)).thenReturn("Foo");

        mockMvc.perform(post("/foobarqix").param("value", "6"))
               .andExpect(content().string("Foo"));
    }

}
