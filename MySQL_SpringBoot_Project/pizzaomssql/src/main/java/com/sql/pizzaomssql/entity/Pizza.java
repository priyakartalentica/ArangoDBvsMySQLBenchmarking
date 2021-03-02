package com.sql.pizzaomssql.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity(name="pizza")
public class Pizza {
    @Id
    private Long pizzaId;
    @Column
    private String pizzaName;
    @Column
    private Double price;
    @Column
    private String type;


    /*@ManyToMany(mappedBy = "pizzas")
    @JsonIgnore
    private List<Order> orders;*/

    public Pizza(Long pizzaId, String pizzaName, double price, String type) {
        this.pizzaId=pizzaId;
        this.pizzaName=pizzaName;
        this.price=price;
        this.type=type;

    }
}
