package com.purnima.jain.data.migration.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purnima.jain.data.migration.domain.model.Event;
import com.purnima.jain.data.migration.domain.service.EventsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/v1/data-migration")
@Slf4j
public class DataMigrationRestController {
	
	@Autowired
	private EventsService eventsService;
	
	@GetMapping(value = "/testGetResult")
	public ResponseEntity<String> getResult() {
		
		log.info("Inside DataMigrationRestController.getResult()....");
		return ResponseEntity.ok().body("Hello World!!");
		
	}
	
	@GetMapping(value = "/getEventsInProgress")
	public ResponseEntity<List<Event>> getEventsInProgress() {
		
		log.info("Inside DataMigrationRestController.getEventsInProgress()....");
		
		List<Event> eventList = eventsService.getEventsInProgress();
		
		return ResponseEntity.ok(eventList);
		
	}

}
