package com.pykube.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class AccountMain {

	public static void main(String[] args) {
		SpringApplication.run(AccountMain.class, args);
	}
}
