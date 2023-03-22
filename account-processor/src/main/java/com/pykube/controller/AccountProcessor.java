package com.pykube.controller;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AccountProcessor {

	public static void main(String[] args) {
		new SpringApplicationBuilder(AccountProcessor.class)
		  .web(WebApplicationType.NONE)
		  .run(args);
	}
	
}
