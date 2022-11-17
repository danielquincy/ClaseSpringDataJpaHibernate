package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DanielConfiguration {
    @Value("${usr}")
    private String usr;

    @Value("${pas}")
    private String pas;

    @Bean
    public DataSource getDataSource(){
        DataSourceBuilder oData = DataSourceBuilder.create();
        oData.url("jdbc:sqlserver://192.168.10.136;databaseName=PRUEBA;trustServerCertificate=true");
        oData.username(usr);
        oData.password(pas);
       return oData.build();
    }
}
