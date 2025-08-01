package com.example.spring_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class SpringProjectApplicationTests {

    @Autowired
    private MockMvc mockMvc;

//    @Test
//    public void testAddNode() throws Exception {
//        mockMvc.perform(post("/api/nodes")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"name\":\"Node1\",\"location\":\"Dublin\",\"latitude\":10,\"longitude\":20}"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id").exists());
//    }
}
