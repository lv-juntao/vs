package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value="/home")
    public String home() {
		logger.info("============================DOCKER-DEMO================================");
		logger.info("============================DOCKER-DEMO================================");
		logger.info("============================DOCKER-DEMO================================");
		logger.info("============================DOCKER-DEMO================================");
		logger.info("============================DOCKER-DEMO================================");
		
        return "Hello Docker World."
                + "<br />Welcome to <a href='http://waylau.com'>waylau.com</a></li>";
    }

}
