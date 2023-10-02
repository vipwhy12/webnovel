package com.webnovel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebnovelApplication {

	public static void main(String[] args) {

		Hello hello = new Hello();
		hello.setData("hihi");
		String data = hello.getData();

		System.out.println(data);

		SpringApplication.run(WebnovelApplication.class, args);
	}

}
