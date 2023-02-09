package com.company.Summative1AwoleiroIbrahim.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.company.Summative1AwoleiroIbrahim.model.Quote;
import com.company.Summative1AwoleiroIbrahim.model.Word;
import com.company.Summative1AwoleiroIbrahim.model.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.MediaType;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(apiController.class)
public class apiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldGetWord() throws Exception {
        mockMvc.perform(get("/word"))
                .andDo(print())
                .andExpect(status().isOk());

    }

    @Test
    public void shouldGetQuote() throws Exception {
        mockMvc.perform(get("/quote"))
                .andDo(print())
                .andExpect(status().isOk());

    }

    @Test
    public void postAnswer() throws Exception {
        // ARRANGE
        Answer inputAnswer = new Answer();
        inputAnswer.setAnswer("I am good.");
        inputAnswer.setQuestion("How are you?");

        // Convert Java Object to JSON
        String inputJson = mapper.writeValueAsString(inputAnswer);
        mockMvc.perform(
                        post("/magic")
                                .content(inputJson)                       // Set the request body
                                .contentType(MediaType.APPLICATION_JSON)  // Tell the server it's in JSON format
                )
                .andDo(print())                // Print results to console
                .andExpect(status().isCreated());        // ASSERT (status code is 201)
    }



}