package ru.cvtps2dq.homework2.service;


import ru.zulvit.dz2.model.Plane;

import java.util.List;
import java.util.Optional;

public interface PlaneService {
    void savePlane(Plane plane);

    void deletePlane(Plane plane);

    void deletePlaneById(Long id);

    Optional<Plane> findPlaneById(Long id);

    List<Plane> findAllPlanes();

    List<Plane> findAllPlanesByModel(String model);

    void saveListOfPlanes(List<Plane> planes);
}