package com.example.temp;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DanielConfiguration {

    @Bean
    public DataSource getDataSourve(){
        DataSourceBuilder oData = DataSourceBuilder.create();
        oData.url("jdbc:sqlserver://192.168.10.136;databaseName=PRUEBA;trustServerCertificate=true");
        oData.username("UCEM_IRENE");
        oData.password("1234");
       return oData.build();
    }
}
