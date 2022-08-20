package com.example.ademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class IpsSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpsSimpleApplication.class, args);
	}
	
	@Configuration
	public class WebMvcConfiguration implements WebMvcConfigurer {

	    public void addCorsMappings(CorsRegistry registry) {
	        
	        registry
	            .addMapping("/**")
	            .allowedOrigins("*")
	            .allowCredentials(true)
				.allowedHeaders("Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method", "Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials")
	            .maxAge(-1)
	            .allowedMethods("GET", "POST", "OPTIONS", "PUT")
	            ;
	    }
	}


}
