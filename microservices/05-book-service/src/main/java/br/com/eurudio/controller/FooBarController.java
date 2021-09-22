package br.com.eurudio.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;



@RestController 
@RequestMapping("book-service")
public class FooBarController {

	private Logger logger = LoggerFactory.getLogger(FooBarController.class);
	
	
	
	@GetMapping("/foo-bar") 
	@Retry(name= "default")
	 public String fooBar() {
		
		logger.info("Request to foo0bar is received");
		
	var response =	new RestTemplate().getForEntity("http://localhost:8080/foo-bar", String.class);
		 return response.getBody();
	}
}
