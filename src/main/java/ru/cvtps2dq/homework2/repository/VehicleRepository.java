package ru.cvtps2dq.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.zulvit.dz2.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}