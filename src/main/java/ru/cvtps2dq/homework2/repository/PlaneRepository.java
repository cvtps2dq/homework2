package ru.cvtps2dq.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.zulvit.dz2.model.Plane;

import java.util.List;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long> {
    List<Plane> findAllByModel(String model);
}