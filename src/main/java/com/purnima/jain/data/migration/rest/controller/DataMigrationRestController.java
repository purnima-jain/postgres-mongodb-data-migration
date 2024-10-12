package com.purnima.jain.data.migration.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/v1/data-migration")
@Slf4j
public class DataMigrationRestController {
	
	@GetMapping(value = "/testGetResult")
	public ResponseEntity<String> getResult() {
		
		log.info("Inside DataMigrationRestController.getResult()....");
		return ResponseEntity.ok().body("Hello World!!");
		
	}

}
