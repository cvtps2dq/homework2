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
public class Bike extends Vehicle{
    private final static String TYPE = "Bike";
    public Bike(String model, BigDecimal price, String fuelType) {
        super(TYPE, model, price, fuelType);
    }
}