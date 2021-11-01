package com.testejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan(basePackages = {"com.testejava.model"})
@ComponentScan(basePackages = {"com.*"})
@EnableWebMvc
@RestController
@EnableAutoConfiguration
public class ProjetoTesteJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoTesteJavaApplication.class, args);  
	}

}
