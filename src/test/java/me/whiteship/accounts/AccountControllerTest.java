package me.whiteship.accounts;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.whiteship.AmugonaApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import javax.transaction.Transactional;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by tyson on 2017-05-27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Transactional
public class AccountControllerTest {

    @Autowired
    WebApplicationContext wac;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void createAccount() throws Exception{

        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

        AccountDto.Create creatDto = new AccountDto.Create();
        creatDto.setUsername("whiteship");
        creatDto.setPassword("password");

        ResultActions result = mockMvc.perform(post("/accounts")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(creatDto)));

        result.andDo(print());
        result.andExpect(status().isCreated());
        
    }
}
