package ru.cvtps2dq.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.zulvit.dz2.model.Truck;

import java.util.List;

@Repository
public interface TruckRepository extends JpaRepository<Truck, Long> {
    List<Truck> findAllByModel(String model);
}