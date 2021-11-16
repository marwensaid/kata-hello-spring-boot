package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceResponse {

    @Autowired
    RestTemplate restTemplate;

    public String callResponse() {

        String response = restTemplate
                .exchange("http://localhost:3332/result"
                        , HttpMethod.GET
                        , null
                        , new ParameterizedTypeReference<String>() {
                        }).getBody();

        return "this is my result : " + response;
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
