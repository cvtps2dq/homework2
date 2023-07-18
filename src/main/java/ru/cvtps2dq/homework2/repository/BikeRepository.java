package ru.cvtps2dq.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.zulvit.dz2.model.Bike;

import java.util.List;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {
    List<Bike> findAllByModel(String model);
}