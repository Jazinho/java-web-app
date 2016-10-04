package com.services;

import com.dtos.CarDto;
import com.entities.CarEntity;
import com.repositories.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Cars Service
 */

@Service
public class CarsService {

    private final CarsRepository carsRepository;

    @Autowired
    public CarsService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    public CarDto getCarWithUuid(Long uuid){

        return parseToDto(carsRepository.findOne(uuid));
    }

    private CarDto parseToDto(CarEntity carEntity){
        return new CarDto(carEntity.getType(),carEntity.getPrice(),carEntity.getProductionYear(),
                carEntity.getPassedKms(),carEntity.getMarka(),carEntity.getModel());
    }

}
