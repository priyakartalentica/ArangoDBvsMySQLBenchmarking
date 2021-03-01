package com.arango.pizzaDelivery.entity;

import com.arangodb.springframework.annotation.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data
@Document("pizza")
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {
    @Id
    private Long pizzaId;
    private String pizzaName;
    private Double price;
    private String type;



}
