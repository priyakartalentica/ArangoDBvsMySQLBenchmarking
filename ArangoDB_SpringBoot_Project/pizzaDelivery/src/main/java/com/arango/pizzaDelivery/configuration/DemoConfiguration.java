package com.arango.pizzaDelivery.configuration;

import com.arangodb.ArangoDB;
import com.arangodb.springframework.annotation.EnableArangoRepositories;
import com.arangodb.springframework.config.AbstractArangoConfiguration;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableArangoRepositories(basePackages = { "com.arango.pizzaDelivery.repository" })
public class DemoConfiguration extends AbstractArangoConfiguration {
    @Override
    public ArangoDB.Builder arango() {
        return new ArangoDB.Builder()
                //.host("localhost", 8529)
                .host("52.183.130.98", 8529)
                .user("root")
                .password("password");
                //.maxConnections(20);
    }

    @Override
    public String database() {
        return "pizzaoms";
    }
}