package com.purnima.jain.data.migration.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purnima.jain.data.migration.database.dao.EventsDAO;
import com.purnima.jain.data.migration.domain.model.Event;

@Service
public class EventsService {
	
	@Autowired
	private EventsDAO eventsDAO;
	
	public List<Event> getEventsInProgress() {
		
		String eventStatus = "In-Progress";
		
		List<Event> eventList = eventsDAO.getEvents(eventStatus);
		return eventList;
		
	}
	
	
	
	

}
