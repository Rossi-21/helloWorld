package com.rossi21.helloworld;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController

@RequestMapping("/hello")
public class HomeController {
	
	@RequestMapping("")
	public String hello() {
		return "Hello World!";
	}
	
	@RequestMapping("/world")
    public String world() {
            return "Class level annotations are cool too!";
    }

}
