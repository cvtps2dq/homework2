package ru.cvtps2dq.homework2.service;

import ru.zulvit.dz2.model.Truck;

import java.util.List;
import java.util.Optional;

public interface TruckService {
    void saveTruck(Truck truck);

    void deleteTruck(Truck truck);

    void deleteTruckById(Long id);

    void saveListOfTruck(List<Truck> trucks);

    Optional<Truck> findTruckById(Long id);

    List<Truck> findAllTruck();

    List<Truck> findAllTrucksByModel(String model);
}