package com.dvp.jidch;

import com.dvp.jidch.web.WebControllerRest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@SpringBootTest
@WebAppConfiguration
class DemoApplicationTests {

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new WebControllerRest()).build();
    }

    @Test
    public void getUser() throws Exception {
        String responseString = mockMvc.perform(MockMvcRequestBuilders.post("/getUser"))
                .andReturn().getResponse().getContentAsString();
        System.out.println("result : "+responseString);
    }

}
