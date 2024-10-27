-- 002-init-data.sql

BEGIN;

-- data setup

INSERT INTO users (username, email) 
VALUES ('user1', 'user1@example.com');

INSERT INTO users (username, email) 
VALUES ('user2', 'user2@example.com');

COMMIT;
