package ru.cvtps2dq.homework2.service;


import ru.zulvit.dz2.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    void saveCar(Car car);

    void deleteCar(Car car);

    void deleteCarById(Long id);

    Optional<Car> findCarById(Long id);

    List<Car> findAllCars();

    List<Car> findAllCarsByModel(String model);

    void saveListOfCars(List<Car> cars);
}