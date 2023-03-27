package com.pykube.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pykube.controller.dto.AccountDTO;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	
	
	@PostConstruct
	public void into() {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("!!!!!!!!!!!!JOB STARTED!!!!!!!!!!!!!!!");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
	}
	
	@PostMapping("/")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String create(@RequestBody AccountDTO accountDTO) {
		System.out.println("Post method is called to  create = "+accountDTO);
		System.out.println("Prometheus monitoring is on................");
		kafkaTemplate.send("pykube02",accountDTO.getName()+" - "+accountDTO.getEmail());
		System.out.println("Message is published successfully");
		return "created";
	}
	
	@GetMapping("/test")
	public String test() {
		return "~~~~~~~~~~~~Hi I got it!~~~~~~~~~~";
	}

}
