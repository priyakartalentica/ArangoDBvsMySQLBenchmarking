package com.arango.pizzaDelivery.service;

import com.arango.pizzaDelivery.entity.Order;
import com.arango.pizzaDelivery.entity.OrderDTO;
import com.arango.pizzaDelivery.entity.OrderMapper;
import com.arango.pizzaDelivery.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderMapper orderMapper;

    public List<OrderDTO> listAllOrders(){

        return  orderMapper.listOrdertoOrderDTO((List<Order>) orderRepository.findAll());
    }

    public OrderDTO createOrder(OrderDTO orderDTO) {
      /* for(int i=0;i<3000;i++){
           Order order=orderRepository.save(orderMapper.orderDTOtoOrder(orderDTO));
           System.out.println(order.getOrderId() +" "+i);
       }*/
        Order order= orderMapper.orderDTOtoOrder(orderDTO);
        Date date1= new Date();
        Order order1=orderRepository.save(order);
        Date date2=new Date();
        long diff=date2.getTime()-date1.getTime();
        System.out.println("Difference : "+diff);
        OrderDTO orderDTO1=orderMapper.ordertoOrderDTO(order1);


        return orderDTO1;
        //return orderMapper.ordertoOrderDTO(orderRepository.save(orderMapper.orderDTOtoOrder(orderDTO)));
    }

   /* public Order createOrder1(Order order) {
        return orderRepository.save(order);
    }*/
    public OrderDTO getOrderById(Long orderId) {
        Date date1=new Date();
        Optional<Order> order= orderRepository.findById(orderId);
        Date date2=new Date();
        long diff=date2.getTime()-date1.getTime();
        System.out.println("Difference : "+diff);
        if(order.isPresent()) {
            return orderMapper.ordertoOrderDTO(order.get());
        }
        else
            return null;
    }

    public Iterable<OrderDTO> getOrderByState(String state) {
        Iterable<Order> orders= orderRepository.findByState(state);

        if(orders.iterator().hasNext()) {
            return orderMapper.listOrdertoOrderDTO((orders));
        }
        else
            return null;
    }

    public Iterable<OrderDTO> getOrderByCity(String city) {
        Map<String, Object> bindvars = new HashMap<>();
        bindvars.put("city", city);
        bindvars.put("@col", Order.class);

        Date date1=new Date();
        Iterable<Order> orders= orderRepository.findByCity(city,bindvars);
        Date date2=new Date();
        long diff=date2.getTime()-date1.getTime();
        System.out.println("Difference : "+diff);
        if(orders.iterator().hasNext()) {
            System.out.println("ORders");
            return orderMapper.listOrdertoOrderDTO(orders);
        }
        else
            return null;
    }
}
