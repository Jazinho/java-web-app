package com.repositories;

import com.entities.CarEntity;
import com.values.CarType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarsRepository extends JpaRepository<CarEntity,Long> {

    public List<CarEntity> findByPriceBetween(int price);

    public List<CarEntity> findByProductionYear(int productionYear);

    public List<CarEntity> findByPassedKms(int passedKms);

    public List<CarEntity> findByBrand(String brand);

    public List<CarEntity> findByType(CarType type);

    public List<CarEntity> findByModel(String model);

}
