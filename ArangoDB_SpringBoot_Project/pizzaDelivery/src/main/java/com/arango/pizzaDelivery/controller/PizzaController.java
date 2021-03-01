package com.arango.pizzaDelivery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pizza")
public class PizzaController {

    @GetMapping
    public String listAllPizza(){
        return "Hello world from pizza";
    }
}
