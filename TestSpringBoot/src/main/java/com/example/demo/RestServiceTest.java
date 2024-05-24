package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("check/")
public class RestServiceTest {
	
    @GetMapping("/all")
    public String findAll(){
        return "Merhaba Spring Boot 12222222222";
    }

}
