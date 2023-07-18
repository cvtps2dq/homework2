package ru.cvtps2dq.homework2.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@ToString
public class Truck extends Vehicle {
    private final static String TYPE = "Truck";
    private Double loadCapacity;

    public Truck(String model, BigDecimal price, String fuelType, Double loadCapacity) {
        super(TYPE, model, price, fuelType);
        this.loadCapacity = loadCapacity;
    }
}