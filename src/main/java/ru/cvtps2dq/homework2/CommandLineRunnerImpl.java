package ru.cvtps2dq.homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.zulvit.dz2.model.Bike;
import ru.zulvit.dz2.model.Car;
import ru.zulvit.dz2.model.Plane;
import ru.zulvit.dz2.model.Truck;
import ru.zulvit.dz2.service.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    private final CarService carService;
    private final BikeService bikeService;
    private final TruckService truckService;
    private final PlaneService planeService;
    private final TransportManagementService transportManagementService;

    @Autowired
    public CommandLineRunnerImpl(CarService carService, BikeService bikeService, TruckService truckService, PlaneService planeService, TransportManagementService transportManagementService) {
        this.carService = carService;
        this.bikeService = bikeService;
        this.truckService = truckService;
        this.planeService = planeService;
        this.transportManagementService = transportManagementService;
    }

    @Override
    public void run(String... args) {
        try {
            seedData();
            carService.findAllCars().forEach(System.out::println);
            bikeService.findAllBikes().forEach(System.out::println);
            planeService.findAllPlanes().forEach(System.out::println);
            truckService.findAllTruck().forEach(System.out::println);
            transportManagementService.getMostPopularModels().entrySet().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void seedData() {
        List<Car> cars = Arrays.asList(
                new Car("Tesla Model S", BigDecimal.valueOf(8000000), "Electric", 4),
                new Car("Lamborghini Aventador", BigDecimal.valueOf(15000000), "Petrol", 2),
                new Car("Porsche 911", BigDecimal.valueOf(5000000), "Petrol", 2)
        );
        List<Bike> bikes = Arrays.asList(
                new Bike("Specialized S-Works", BigDecimal.valueOf(100000), "No fuel"),
                new Bike("Trek Domane SLR", BigDecimal.valueOf(80000), "No fuel"),
                new Bike("Canyon Ultimate", BigDecimal.valueOf(120000), "No fuel")
        );
        List<Plane> planes = Arrays.asList(
                new Plane("Boeing 787 Dreamliner", BigDecimal.valueOf(300000000), "Kerosene", "Boeing", 300),
                new Plane("Airbus A350 XWB", BigDecimal.valueOf(275000000), "Kerosene", "Airbus", 350),
                new Plane("Embraer E195-E2", BigDecimal.valueOf(60000000), "Kerosene", "Embraer", 120)
        );
        List<Truck> trucks = Arrays.asList(
                new Truck("Volvo FH16", BigDecimal.valueOf(18000000), "Diesel", 40.0),
                new Truck("Scania R730", BigDecimal.valueOf(20000000), "Diesel", 42.0),
                new Truck("MAN TGX D38", BigDecimal.valueOf(22000000), "Diesel", 38.0)
        );

        transportManagementService.handleNewInventory(bikes, cars, planes, trucks);
    }
}
