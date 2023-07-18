package ru.cvtps2dq.homework2.service;

import ru.zulvit.dz2.model.Bike;
import ru.zulvit.dz2.model.Car;
import ru.zulvit.dz2.model.Plane;
import ru.zulvit.dz2.model.Truck;

import java.util.List;
import java.util.Map;

public interface TransportManagementService {

    void handleNewInventory(List<Bike> bikes, List<Car> cars, List<Plane> planes, List<Truck> trucks);

    void handleSale(Long bikeId, Long carId, Long planeId, Long truckId);

    Map<String, Long> getMostPopularModels();
}
