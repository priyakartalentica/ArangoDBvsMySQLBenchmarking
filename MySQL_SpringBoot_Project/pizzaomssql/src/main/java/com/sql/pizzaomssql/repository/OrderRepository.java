package com.sql.pizzaomssql.repository;

import com.sql.pizzaomssql.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByState(String state);

    List<Order> findTop50ByCity(String city);
}
