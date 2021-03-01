package com.arango.pizzaDelivery.entity;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@NoArgsConstructor
public class OrderMapper {


   public Order orderDTOtoOrder(OrderDTO orderDTO){
        /*List<Pizza> pizzaList=new ArrayList<Pizza>();
       for (Long p: orderDTO.getPizzaId()
            ) {
           Pizza pizza= new Pizza();
           pizza.setPizzaId(p);
           pizzaList.add(pizza);


       }*/
       Pizza pizza=new Pizza();
       pizza.setPizzaId(orderDTO.getPizzaId());
       return new Order(orderDTO.getOrderId(),
               orderDTO.getMobileNo(),
               pizza,
               orderDTO.getOrderTotalAmount(),
               orderDTO.getDelivaryAddress(),
               orderDTO.getIsDelivered(),
               orderDTO.getCustomerName(),
               orderDTO.getLandmark(),
               orderDTO.getCity(),
               orderDTO.getState(),
               orderDTO.getPincode(),
               orderDTO.getOrderInstruction(),
               orderDTO.getFoodAlergies(),
               orderDTO.getStoreName(),
               orderDTO.getStoreAddress(),
               orderDTO.getStorecity(),
               orderDTO.getStorestate(),
               orderDTO.getStorepincode(),
               orderDTO.getOrderReference(),
               orderDTO.getCustomeralternatemobileNo(),
               orderDTO.getDelivaryInstuction(),
               orderDTO.getOrderDate(),
               orderDTO.getInfo1(),
               orderDTO.getInfo2(),
               orderDTO.getInfo3(),
               orderDTO.getInfo4(),
               orderDTO.getInfo5(),
               orderDTO.getInfo6(),
               orderDTO.getInfo7(),
               orderDTO.getInfo8(),
               orderDTO.getInfo9(),
               orderDTO.getInfo10(),
               orderDTO.getInfo11(),
               orderDTO.getInfo12(),
               orderDTO.getInfo13(),
               orderDTO.getInfo14(),
               orderDTO.getInfo15(),
               orderDTO.getInfo16(),
               orderDTO.getInfo17(),
               orderDTO.getInfo18(),
               orderDTO.getInfo19(),
               orderDTO.getInfo20(),
               orderDTO.getInfo21(),
               orderDTO.getInfo22(),
               orderDTO.getInfo23(),
               orderDTO.getInfo24(),
               orderDTO.getInfo25(),
               orderDTO.getInfo26(),
               orderDTO.getInfo27(),
               orderDTO.getInfo28(),
               orderDTO.getInfo29(),
               orderDTO.getInfo30());

   }

    public OrderDTO ordertoOrderDTO(Order order){
       /* List<Long> pizzaList=new ArrayList<Long>();
        for (Pizza p: order.getPizza()) {
            Long pizza= p.getPizzaId();
            pizzaList.add(pizza);
        }*/
        Long pizzaID= new Long(0);
        if(order.getPizza()!=null)
            pizzaID=order.getPizza().getPizzaId();
        return new OrderDTO(order.getOrderId(),
                order.getMobileNo(),
                pizzaID,
                order.getOrderTotalAmount(),
                order.getDelivaryAddress(),
                order.getIsDelivered(),order.getCustomerName(),
                order.getLandmark(),
                order.getCity(),
                order.getState(),
                order.getPincode(),
                order.getOrderInstruction(),
                order.getFoodAlergies(),
                order.getStoreName(),
                order.getStoreAddress(),
                order.getStorecity(),
                order.getStorestate(),
                order.getStorepincode(),
                order.getOrderReference(),
                order.getCustomeralternatemobileNo(),
                order.getDelivaryInstuction(),
                order.getOrderDate(),
                order.getInfo1(),
                order.getInfo2(),
                order.getInfo3(),
                order.getInfo4(),
                order.getInfo5(),
                order.getInfo6(),
                order.getInfo7(),
                order.getInfo8(),
                order.getInfo9(),
                order.getInfo10(),
                order.getInfo11(),
                order.getInfo12(),
                order.getInfo13(),
                order.getInfo14(),
                order.getInfo15(),
                order.getInfo16(),
                order.getInfo17(),
                order.getInfo18(),
                order.getInfo19(),
                order.getInfo20(),
                order.getInfo21(),
                order.getInfo22(),
                order.getInfo23(),
                order.getInfo24(),
                order.getInfo25(),
                order.getInfo26(),
                order.getInfo27(),
                order.getInfo28(),
                order.getInfo29(),
                order.getInfo30());

    }

    public List<OrderDTO> listOrdertoOrderDTO(Iterable<Order> orderList){
        List<OrderDTO> orderDTOList=new ArrayList<OrderDTO>();
        for (Order o: orderList) {
            orderDTOList.add(ordertoOrderDTO(o));
        }
        return orderDTOList;
    }


    public List<Order> listOrderDTOtoOrder(List<OrderDTO> orderDTOList){
        List<Order> orderList=new ArrayList<Order>();
        for (OrderDTO orderDTO: orderDTOList) {
            orderList.add(orderDTOtoOrder(orderDTO));
        }
        return orderList;
    }



}
