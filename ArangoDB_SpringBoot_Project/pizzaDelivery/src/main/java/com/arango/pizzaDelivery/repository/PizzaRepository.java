package com.arango.pizzaDelivery.repository;

import com.arango.pizzaDelivery.entity.Pizza;
import com.arangodb.springframework.repository.ArangoRepository;

public interface PizzaRepository extends ArangoRepository<Pizza, Long>{
}
