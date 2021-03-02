package com.sql.pizzaomssql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.sql.pizzaomssql.service","com.sql.pizzaomssql.repository","com.sql.pizzaomssql.entity","com.sql.pizzaomssql.controller"})
public class PizzaomssqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaomssqlApplication.class, args);
	}

}
