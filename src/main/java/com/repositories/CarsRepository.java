package com.repositories;

import com.dtos.CarDto;
import com.values.CarType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarsRepository extends CrudRepository<CarDto,Long> {

    public List<CarDto> findByPriceBetween(int price);

    public List<CarDto> findByProductionYear(int productionYear);

    public List<CarDto> findByPassedKms(int passedKms);

    public List<CarDto> findByBrand(String brand);

    public List<CarDto> findByType(CarType type);

    public List<CarDto> findByModel(String model);

}
