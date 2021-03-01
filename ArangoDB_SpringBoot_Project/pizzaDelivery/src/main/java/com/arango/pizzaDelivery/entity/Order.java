package com.arango.pizzaDelivery.entity;

import com.arangodb.springframework.annotation.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Document("order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    private Long orderId;
    private String mobileNo;
    private Pizza pizza;
    private Double OrderTotalAmount;
    private String delivaryAddress;
    private Boolean isDelivered;

    private String customerName;

    private String landmark;

    private String city;

    private String state;

    private String pincode;

    private String OrderInstruction;

    private String foodAlergies;

    private String storeName;

    private String storeAddress;

    private String storecity;

    private String storestate;

    private String storepincode;

    private String orderReference;

    private String customeralternatemobileNo;

    private String DelivaryInstuction;

    private Date orderDate;

    private String info1;

    private String info2;

    private String info3;

    private String info4;

    private String info5;

    private String info6;

    private String info7;

    private String info8;

    private String info9;

    private String info10;

    private String info11;

    private String info12;

    private String info13;

    private String info14;

    private String info15;

    private String info16;

    private String info17;

    private String info18;

    private String info19;

    private String info20;

    private String info21;

    private String info22;

    private String info23;

    private String info24;

    private String info25;

    private String info26;

    private String info27;

    private String info28;

    private String info29;

    private String info30;

}
