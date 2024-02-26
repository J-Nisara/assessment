package com.kbtg.bootcamp.posttest;

import org.hibernate.boot.model.relational.Database;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PosttestApplication {

	public static void main(String[] args) {
//		SpringApplication.run(PosttestApplication.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(PosttestApplication.class, args);
	}

}
