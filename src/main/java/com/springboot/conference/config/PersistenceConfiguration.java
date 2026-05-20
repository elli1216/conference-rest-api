package com.springboot.conference.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder<?> builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://127.0.0.1:5432/postgres");
        System.out.println("Custom datasource have been initialized and set.");
        return builder.build();
    }
}
