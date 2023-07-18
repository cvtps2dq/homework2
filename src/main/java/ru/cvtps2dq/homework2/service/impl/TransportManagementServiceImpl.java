package ru.cvtps2dq.homework2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zulvit.dz2.model.Bike;
import ru.zulvit.dz2.model.Car;
import ru.zulvit.dz2.model.Plane;
import ru.zulvit.dz2.model.Truck;
import ru.zulvit.dz2.service.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class TransportManagementServiceImpl implements TransportManagementService {
    private final BikeService bikeService;
    private final CarService carService;
    private final PlaneService planeService;
    private final TruckService truckService;

    @Autowired
    public TransportManagementServiceImpl(BikeService bikeService, CarService carService, PlaneService planeService, TruckService truckService) {
        this.bikeService = bikeService;
        this.carService = carService;
        this.planeService = planeService;
        this.truckService = truckService;
    }

    public void handleNewInventory(List<Bike> bikes, List<Car> cars, List<Plane> planes, List<Truck> trucks) {
        bikeService.saveListOfBikes(bikes);
        carService.saveListOfCars(cars);
        planeService.saveListOfPlanes(planes);
        truckService.saveListOfTruck(trucks);
    }

    public void handleSale(Long bikeId, Long carId, Long planeId, Long truckId) {
        bikeService.deleteBikeById(bikeId);
        carService.deleteCarById(carId);
        planeService.deletePlaneById(planeId);
        truckService.deleteTruckById(truckId);
    }

    public Map<String, Long> getMostPopularModels() {
        List<String> bikeModels = bikeService.findAllBikes().stream().map(Bike::getModel).collect(Collectors.toList());
        List<String> carModels = carService.findAllCars().stream().map(Car::getModel).collect(Collectors.toList());
        List<String> planeModels = planeService.findAllPlanes().stream().map(Plane::getModel).collect(Collectors.toList());
        List<String> truckModels = truckService.findAllTruck().stream().map(Truck::getModel).collect(Collectors.toList());

        return Stream.of(bikeModels, carModels, planeModels, truckModels)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(model -> model, Collectors.counting()));
    }
}
