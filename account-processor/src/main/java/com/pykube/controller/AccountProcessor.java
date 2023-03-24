package com.pykube.controller;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class AccountProcessor {

	public static void main(String[] args) {
		new SpringApplicationBuilder(AccountProcessor.class)
		  .web(WebApplicationType.NONE)
		  .run(args);
	}
	
}
