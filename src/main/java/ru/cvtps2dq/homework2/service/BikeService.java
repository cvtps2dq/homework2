package ru.cvtps2dq.homework2.service;


import ru.zulvit.dz2.model.Bike;

import java.util.List;
import java.util.Optional;

public interface BikeService {
    void saveBike(Bike bike);

    void saveListOfBikes(List<Bike> bikes);

    void deleteBike(Bike bike);

    void deleteBikeById(Long id);

    Optional<Bike> findBikeById(Long id);

    List<Bike> findAllBikes();

    List<Bike> findAllBikesByModel(String model);
}