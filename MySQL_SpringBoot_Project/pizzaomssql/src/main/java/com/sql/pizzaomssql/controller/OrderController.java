package com.sql.pizzaomssql.controller;

import com.sql.pizzaomssql.entity.Order;
import com.sql.pizzaomssql.entity.OrderDTO;
import com.sql.pizzaomssql.entity.Pizza;
import com.sql.pizzaomssql.service.OrderService;
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
       /* List<Long> pizzaId=new ArrayList<Long>();
        pizzaId.add(1L);
        orderDTO.setPizzaId(pizzaId);*/

       return orderService.createOrder(orderDTO);
    }

    @GetMapping("{orderId}")
    public OrderDTO getOrderById(@PathVariable Long orderId){
        return orderService.getOrderById(orderId);
    }

    @GetMapping("/state/{state}")
    public List<OrderDTO> getOrderBystate(@PathVariable String state){
        return orderService.getOrderByState(state);
    }

    @GetMapping("/city/{city}")
    public List<OrderDTO> getOrderByCity(@PathVariable String city){
        return orderService.getOrderByCity(city);
    }
}
