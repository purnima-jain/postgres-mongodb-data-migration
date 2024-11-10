package com.purnima.jain.data.migration.database.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.purnima.jain.data.migration.domain.model.Event;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class EventsDAO {
	
	@Autowired
	@Qualifier("postgresJdbcTemplate")
	private NamedParameterJdbcTemplate postgresJdbcTemplate;
	
	public List<Event> getEvents(String eventStatus) {
		
		String query = "SELECT * FROM events WHERE event_status = :EVENT_STATUS";
		Map<String, Object> params = new HashMap<>();
		params.put("EVENT_STATUS", eventStatus);
		
		List<Map<String, Object>> eventListFromPostgres = postgresJdbcTemplate.queryForList(query, params);	
		log.info("Count of eventListFromPostgres::{}", eventListFromPostgres.size());
		
		List<Event> eventList = processEventListFromPostgres(eventListFromPostgres);
		return eventList;
		
	}

	private List<Event> processEventListFromPostgres(List<Map<String, Object>> eventListFromPostgres) {

		List<Event> eventList = new ArrayList<>();
		for(Map<String, Object> aPostgresRow : eventListFromPostgres) {
			Event event = new Event();
			event.setEventId((Integer)aPostgresRow.get("ID"));
			event.setEventName((String)aPostgresRow.get("EVENT_NAME"));
			event.setEventStatus((String)aPostgresRow.get("EVENT_STATUS"));
			
			eventList.add(event);
		}
		return eventList;
	}

}
