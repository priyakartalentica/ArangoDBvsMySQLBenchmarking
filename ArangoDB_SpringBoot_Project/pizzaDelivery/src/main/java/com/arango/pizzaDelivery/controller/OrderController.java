package com.arango.pizzaDelivery.controller;

import com.arango.pizzaDelivery.entity.Order;
import com.arango.pizzaDelivery.entity.OrderDTO;
import com.arango.pizzaDelivery.entity.Pizza;
import com.arango.pizzaDelivery.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pizzaorder")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<OrderDTO> listAllOrders(){
        return orderService.listAllOrders();
    }

    @PostMapping
    public OrderDTO createOrder(@RequestBody OrderDTO orderDTO){
       List<Long> pizzaIds= new ArrayList<Long>();
       pizzaIds.add(1L);
       return orderService.createOrder(orderDTO);
    }

    @GetMapping("{orderId}")
    public OrderDTO getOrderById(@PathVariable Long orderId){
        return orderService.getOrderById(orderId);
    }

    @GetMapping("/state/{state}")
    public Iterable<OrderDTO> getOrderBystate(@PathVariable String state){
        return orderService.getOrderByState(state);
    }

    @GetMapping("/city/{city}")
    public Iterable<OrderDTO> getOrderByCity(@PathVariable String city){
        return orderService.getOrderByCity(city);
    }
}
