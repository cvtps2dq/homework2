package ru.cvtps2dq.homework2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zulvit.dz2.model.Car;
import ru.zulvit.dz2.repository.CarRepository;
import ru.zulvit.dz2.service.CarService;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void saveCar(Car car) {
        carRepository.saveAndFlush(car);
    }

    @Override
    public void deleteCar(Car car) {
        carRepository.delete(car);
    }

    @Override
    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    public Optional<Car> findCarById(Long id) {
        return carRepository.findById(id);
    }

    @Override
    public List<Car> findAllCars() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> findAllCarsByModel(String model) {
        return carRepository.findAllByModel(model);
    }

    @Override
    public void saveListOfCars(List<Car> cars) {
        carRepository.saveAllAndFlush(cars);
    }
}