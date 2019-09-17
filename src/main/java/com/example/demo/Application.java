package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Application {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RequestMapping("/home")
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
