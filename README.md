# postgres-mongodb-data-migration
Demo project for Postgres to MongoDB Data Migration

## Postgres Instantiation & Initialization
Ref: https://event-driven.io/en/automatically_connect_pgadmin_to_database/

## Useful Commands
> docker-compose up

> docker-compose down -v

> docker ps


## On Environment Variables in Pgadmin Environment
You may have noticed a weird syntax: ${PGADMIN_DEFAULT_EMAIL:-pgadmin4@pgadmin.org}. This setup means that if PGADMIN_DEFAULT_EMAIL is defined in the host environment, then its value is used. Otherwise, it will fall back to the default value (in our case pgadmin4@pgadmin.org).

You could pass such variables in the shell:

export PGADMIN_DEFAULT_EMAIL=myemail@example.com
export PGADMIN_DEFAULT_PASSWORD=securepassword
export PGADMIN_PORT=6666
docker-compose up

Or define the .env file in the same folder as our docker-compose.yml file, and Docker will use it automatically.

PGADMIN_DEFAULT_EMAIL=myemail@example.com
PGADMIN_DEFAULT_PASSWORD=securepassword
PGADMIN_PORT=6666

## To Open PgAdmin in browser
URL: http://localhost:15433/browser/

## To Open Adminer in browser
URL: http://localhost:15434/

