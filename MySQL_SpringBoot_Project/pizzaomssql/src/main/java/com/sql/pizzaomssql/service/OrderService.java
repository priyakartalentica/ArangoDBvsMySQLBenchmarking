package com.sql.pizzaomssql.service;

import com.sql.pizzaomssql.entity.Order;
import com.sql.pizzaomssql.entity.OrderDTO;
import com.sql.pizzaomssql.entity.OrderMapper;
import com.sql.pizzaomssql.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderMapper orderMapper;

    public List<OrderDTO> listAllOrders(){

        return  orderMapper.listOrdertoOrderDTO(orderRepository.findAll());
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


        return orderDTO1;//orderMapper.ordertoOrderDTO(orderRepository.save(orderMapper.orderDTOtoOrder(orderDTO)));
    }

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

    public List<OrderDTO> getOrderByState(String state) {
        List<Order> orders= orderRepository.findAllByState(state);
        if(!orders.isEmpty()) {
            return orderMapper.listOrdertoOrderDTO(orders);
        }
        else
            return null;
    }

    public List<OrderDTO> getOrderByCity(String city) {

        Date date1=new Date();
        List<Order> orders= orderRepository.findTop50ByCity(city);
        Date date2=new Date();
        long diff=date2.getTime()-date1.getTime();
        System.out.println("Difference : "+diff);
        if(!orders.isEmpty()) {
            return orderMapper.listOrdertoOrderDTO(orders);
        }
        else
            return null;
    }
}
