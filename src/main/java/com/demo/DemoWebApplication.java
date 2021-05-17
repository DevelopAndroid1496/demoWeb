package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class DemoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}
	
	@SuppressWarnings("deprecation")
	@Bean
	public WebMvcConfigurerAdapter corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:54036").allowedMethods("PUT", "DELETE",
                        "GET", "POST");
            }
        };
	}


}
