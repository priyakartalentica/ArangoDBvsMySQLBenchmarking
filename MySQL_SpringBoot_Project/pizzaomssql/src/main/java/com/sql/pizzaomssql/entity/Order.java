package com.sql.pizzaomssql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="orderpizza")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    @Column
    private String mobileNo;
    //@Column
    //@ManyToMany
    /*@JoinTable(
            name = "pizzaOrder",
            joinColumns = @JoinColumn(name = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "pizzaId")
    )*/
   // private List<Pizza> pizzas;
    @Column
    private Double OrderTotalAmount;
    @Column
    private String delivaryAddress;
    @Column
    private Boolean isDelivered;
    @Column
    private String customerName;
    @Column
    private String landmark;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String pincode;
    @Column
    private String OrderInstruction;
    @Column
    private String foodAlergies;
    @Column
    private String storeName;
    @Column
    private String storeAddress;
    @Column
    private String storecity;
    @Column
    private String storestate;
    @Column
    private String storepincode;
    @Column
    private String orderReference;
    @Column
    private String customeralternatemobileNo;
    @Column
    private String DelivaryInstuction;
    @Column
    private Date orderDate;
    @Column
    private String info1;
    @Column
    private String info2;
    @Column
    private String info3;
    @Column
    private String info4;
    @Column
    private String info5;
    @Column
    private String info6;
    @Column
    private String info7;
    @Column
    private String info8;
    @Column
    private String info9;
    @Column
    private String info10;
    @Column
    private String info11;
    @Column
    private String info12;
    @Column
    private String info13;
    @Column
    private String info14;
    @Column
    private String info15;
    @Column
    private String info16;
    @Column
    private String info17;
    @Column
    private String info18;
    @Column
    private String info19;
    @Column
    private String info20;
    @Column
    private String info21;
    @Column
    private String info22;
    @Column
    private String info23;
    @Column
    private String info24;
    @Column
    private String info25;
    @Column
    private String info26;
    @Column
    private String info27;
    @Column
    private String info28;
    @Column
    private String info29;
    @Column
    private String info30;
}
