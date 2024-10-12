package com.purnima.jain.data.migration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class PostgresMongodbDataMigrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresMongodbDataMigrationApplication.class, args);
		log.info("PostgresMongodbDataMigrationApplication Started........");
	}

}
