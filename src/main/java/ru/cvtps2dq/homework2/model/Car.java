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
public class Car extends Vehicle{
    private final static String TYPE = "Car";
    private Integer seats;

    public Car(String model, BigDecimal price, String fuelType, Integer seats) {
        super(TYPE, model, price, fuelType);
        this.seats = seats;
    }
}