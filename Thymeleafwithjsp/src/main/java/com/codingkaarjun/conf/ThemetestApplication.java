package com.codingkaarjun.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.codingkaarjun.*")
@SpringBootApplication
public class ThemetestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThemetestApplication.class, args);
	}
}
