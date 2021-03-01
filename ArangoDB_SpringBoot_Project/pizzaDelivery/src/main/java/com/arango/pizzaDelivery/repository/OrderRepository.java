package com.arango.pizzaDelivery.repository;

import com.arango.pizzaDelivery.entity.Order;
import com.arangodb.springframework.annotation.BindVars;
import com.arangodb.springframework.annotation.Query;
import com.arangodb.springframework.repository.ArangoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface OrderRepository extends ArangoRepository<Order, Long> {
    @Query("FOR o IN order FILTER o.state == @state  RETURN o")
    Iterable<Order> findByState(@Param("state")String state);

    @Query("FOR o IN @@col FILTER o.city == @city LIMIT 50 RETURN o")
    Iterable<Order> findByCity(String city, @BindVars Map<String, Object> bindvars);
}
