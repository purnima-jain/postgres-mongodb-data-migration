-- 002-init-data.sql

BEGIN;

-- data setup

INSERT INTO users (username, email) 
VALUES ('user1', 'user1@example.com');

INSERT INTO users (username, email) 
VALUES ('user2', 'user2@example.com');


INSERT INTO events (event_name, event_status) 
VALUES ('event_name_1', 'In-Progress');

INSERT INTO events (event_name, event_status) 
VALUES ('event_name_2', 'In-Progress');

INSERT INTO events (event_name, event_status) 
VALUES ('event_name_3', 'Not-In-Progress');

COMMIT;
