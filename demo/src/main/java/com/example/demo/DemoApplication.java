package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
    @GetMapping(path="/printMsg1", produces = "application/json")
    public String getMsg1() 
    {
        return "Hello World ";	
    }
    
    @GetMapping(path="/printMsg2", produces = "application/json")
    public String getMsg2() 
    {
        return "Hello Universe ";
    }

}
