package ru.cvtps2dq.homework2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zulvit.dz2.model.Bike;
import ru.zulvit.dz2.repository.BikeRepository;
import ru.zulvit.dz2.service.BikeService;

import java.util.List;
import java.util.Optional;

@Service
public class BikeServiceImpl implements BikeService {
    private final BikeRepository bikeRepository;

    @Autowired
    public BikeServiceImpl(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @Override
    public void saveBike(Bike bike) {
        bikeRepository.saveAndFlush(bike);
    }

    @Override
    public void saveListOfBikes(List<Bike> bikes) {
        bikeRepository.saveAllAndFlush(bikes);
    }

    @Override
    public void deleteBike(Bike bike) {
        bikeRepository.delete(bike);
    }

    @Override
    public void deleteBikeById(Long id) {
        bikeRepository.deleteById(id);
    }

    @Override
    public Optional<Bike> findBikeById(Long id) {
        return bikeRepository.findById(id);
    }

    @Override
    public List<Bike> findAllBikes() {
        return bikeRepository.findAll();
    }

    @Override
    public List<Bike> findAllBikesByModel(String model) {
        return bikeRepository.findAllByModel(model);
    }
}