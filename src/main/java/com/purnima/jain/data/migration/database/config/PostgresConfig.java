package com.purnima.jain.data.migration.database.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class PostgresConfig {
	
	@Value("${postgres-driverClassName}")
	private String driverClassName;
	
	@Value("${postgres-url}")
	private String url;
	
	@Value("${postgres-username}")
	private String username;
	
	@Value("${postgres-password}")
	private String password;	
	
	@Bean(name = "postgresDataSource")
	public DataSource dataSource()
	{
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(driverClassName);
        dataSourceBuilder.url(url);
        dataSourceBuilder.username(username);
        dataSourceBuilder.password(password);
        return dataSourceBuilder.build();
	}
	
	@Bean(name = "postgresJdbcTemplate")
	public NamedParameterJdbcTemplate postgresJdbcTemplate(@Qualifier("postgresDataSource") DataSource postgresDataSource)
	{
		return new NamedParameterJdbcTemplate(postgresDataSource);
	}
	
//	@Bean
//	public DataSourceInitializer postgresDataSourceInitializer(@Qualifier("postgresDataSource") DataSource postgresDataSource) {
//		ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator();
//		resourceDatabasePopulator.addScript(new ClassPathResource("postgres/schema-postgres.sql"));
//		resourceDatabasePopulator.addScript(new ClassPathResource("postgres/data-postgres.sql"));
//
//		DataSourceInitializer postgresDataSourceInitializer = new DataSourceInitializer();
//		postgresDataSourceInitializer.setDataSource(postgresDataSource);
//		postgresDataSourceInitializer.setDatabasePopulator(resourceDatabasePopulator);
//		return postgresDataSourceInitializer;
//	}

}
