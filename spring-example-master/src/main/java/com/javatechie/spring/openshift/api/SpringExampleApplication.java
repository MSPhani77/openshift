package com.javatechie.spring.openshift.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SpringExampleApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to openshift";
	}



	@Autowired
	private RestTemplate restTemplate;

	public String url = "http://localhost:8081/";

	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		String output= restTemplate.getForObject(url+input,String.class);
		return output;
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringExampleApplication.class, args);
	}
}
