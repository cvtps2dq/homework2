package ru.cvtps2dq.homework2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@Getter
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String model;
    private BigDecimal price;
    private String fuelType;

    public Vehicle(String type, String model, BigDecimal price, String fuelType) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.fuelType = fuelType;
    }
}