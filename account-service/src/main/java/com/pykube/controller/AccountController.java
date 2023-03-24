package com.pykube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
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
	
	@PostMapping("/")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String create(@RequestBody AccountDTO accountDTO) {
		System.out.println("Post method is caleld  create = "+accountDTO);
		kafkaTemplate.send("pykube02",accountDTO.getName()+" - "+accountDTO.getEmail());
		System.out.println("Message is published successfully");
		return "created";
	}

}
