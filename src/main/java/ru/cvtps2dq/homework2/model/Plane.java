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
public class Plane extends Vehicle{
    private final static String TYPE = "Plane";
    private String airline;
    private Integer passengerCapacity;

    public Plane(String model, BigDecimal price, String fuelType, String airline, Integer passengerCapacity) {
        super(TYPE, model, price, fuelType);
        this.airline = airline;
        this.passengerCapacity = passengerCapacity;
    }
}