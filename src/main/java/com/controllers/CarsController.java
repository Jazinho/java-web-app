package com.controllers;

import com.dtos.CarDto;
import com.repositories.CarsRepository;
import com.services.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author Jan Pałucki
 */


@RestController
public class CarsController {

    @Autowired
    protected CarsService carsService;

    @RequestMapping(path = "/cars")
    public String getAllCars() {
        return "All cars here";
    }

    @RequestMapping(path = "/cars/{uuid}", method = RequestMethod.GET)
    public String getSingleCar(@PathVariable("uuid") Long uuid) {
        CarDto carDto = carsService.getCarWithUuid(uuid);
        return carDto.toString();
    }

    @RequestMapping(path = "/cars/search", method = RequestMethod.GET)
    public String searchCars(@RequestParam("lowerPrice") int lowestPrice, @RequestParam("upperPrice") int highestPrice,
                             @RequestParam("lowerYear") int oldest, @RequestParam("upperYear") int newest,
                             @RequestParam("brand") String brand, @RequestParam("type") String type) {
        return "Looking for car\n" +
                "price: " + Integer.toString(lowestPrice) + " - " + Integer.toString(lowestPrice) + "\n" +
                "year: " + Integer.toString(oldest) + " - " + Integer.toString(newest) + "\n" +
                "brand: " + brand +
                "type: " + type;
    }

}
