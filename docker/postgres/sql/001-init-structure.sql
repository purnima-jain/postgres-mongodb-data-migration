-- 001-init-structure.sql 

BEGIN;

-- structure setup

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
);

CREATE TABLE events (
    id SERIAL PRIMARY KEY,
    event_name VARCHAR(50) NOT NULL,
    event_status VARCHAR(100) NOT NULL
);

COMMIT;