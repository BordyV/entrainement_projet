package com.example.classe.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClasseService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "callStudentServiceAndGetData_Fallback")
    public String getStudentFromHTTP(String schoolname) {
        String response = restTemplate
                .exchange("http://localhost:8098/etudiant/{schoolname}"
                        , HttpMethod.GET
                        , null
                        , new ParameterizedTypeReference<String>() {
                        }, schoolname).getBody();

        return "School Name -  " + schoolname + " :::  Student Details " + response;
    }

    @SuppressWarnings("unused")
    private String callStudentServiceAndGetData_Fallback(String schoolname) {
        System.out.println("Student Service is down!!! fallback route enabled...");
        return "CIRCUIT BREAKER ENABLED!!! CEST CASSE PARTEZ VITTTTTTTTTTTTTTTTTTTTTTTTTE";
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
