package com.evolution.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evolution.controller.dto.example.properties.AnyDto;

@RestController
public class ExamplePropertiesController {
	@PostMapping("/example/properties/post")
	public void post(@RequestBody AnyDto anyDto) {
		
	}
}