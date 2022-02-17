package com.example.classe.service;

import com.example.classe.dto.Classe;
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

    public String getStudentFromHTTP(String schoolname) {
        String response = restTemplate
                .exchange("http://localhost:8098/etudiant/{schoolname}"
                        , HttpMethod.GET
                        , null
                        , new ParameterizedTypeReference<String>() {
                        }, schoolname).getBody();

        return "School Name -  " + schoolname + " :::  Student Details " + response;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
