package com.rohitsalecha.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//This class contains all the important Annotations required to configure the entire Multi-Module project

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.rohitsalecha"})
//@EnableJpaRepositories({"com.rohitsalecha"})
//@EntityScan({"com.rohitsalecha"})
public class SpringBootApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class,args);
	}
}
