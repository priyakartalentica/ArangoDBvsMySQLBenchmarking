package com.sql.pizzaomssql.repository;


import com.sql.pizzaomssql.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
