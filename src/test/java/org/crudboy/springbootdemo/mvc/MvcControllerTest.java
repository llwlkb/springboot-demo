package org.crudboy.springbootdemo.mvc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MvcControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testResponseOk() throws Exception {
        mockMvc.perform(get("/mvc/ok"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void testResponse400() throws Exception {
        mockMvc.perform(get("/mvc/err"))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }
}