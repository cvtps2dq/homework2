package ru.cvtps2dq.homework2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zulvit.dz2.model.Truck;
import ru.zulvit.dz2.repository.TruckRepository;
import ru.zulvit.dz2.service.TruckService;

import java.util.List;
import java.util.Optional;

@Service
public class TruckServiceImpl implements TruckService {
    private final TruckRepository truckRepository;

    @Autowired
    public TruckServiceImpl(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }

    @Override
    public void saveTruck(Truck truck) {
        truckRepository.saveAndFlush(truck);
    }

    @Override
    public void deleteTruck(Truck truck) {
        truckRepository.delete(truck);
    }

    @Override
    public void deleteTruckById(Long id) {
        truckRepository.deleteById(id);
    }

    @Override
    public void saveListOfTruck(List<Truck> trucks) {
        truckRepository.saveAllAndFlush(trucks);
    }

    @Override
    public Optional<Truck> findTruckById(Long id) {
        return truckRepository.findById(id);
    }

    @Override
    public List<Truck> findAllTruck() {
        return truckRepository.findAll();
    }

    @Override
    public List<Truck> findAllTrucksByModel(String model) {
        return truckRepository.findAllByModel(model);
    }
}