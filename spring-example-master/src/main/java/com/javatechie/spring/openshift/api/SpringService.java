package com.javatechie.spring.openshift.api;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@Service
public class SpringService {

public RestTemplate restTemplate;

    public String url = "http://localhost:8081/";

    @GetMapping("/{input}")
    public String congrats(@PathVariable String input) {
        return restTemplate.exchange(url+input, HttpMethod.GET,null,String.class).getBody();
    }
}
