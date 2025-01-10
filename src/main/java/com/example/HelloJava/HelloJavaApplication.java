package com.example.HelloJava;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloJavaApplication {
   public static Logger logger= LoggerFactory.getLogger(HelloJavaApplication.class);

   @PostConstruct
   public void intt(){
	   logger.info("Application Started");
   }
	public static void main(String[] args) {

		logger.info("Application Executed  second logger ..........");
		SpringApplication.run(HelloJavaApplication.class, args);
	}

}
