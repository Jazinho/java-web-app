package com.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author Jan Pałucki
 */


@RestController
public class CarsController {

    @RequestMapping(path = "/cars")
    public String getAllCars() {
        return "All cars here";
    }

    @RequestMapping(path = "/cars/{uuid}", method = RequestMethod.GET)
    public String getSingleCar(@PathVariable("uuid") String uuid) {
        return "Specified car with uuid: " + uuid + " here";
    }

    @RequestMapping(path = "/cars/search", method = RequestMethod.GET)
    public String searchCars(@RequestParam("lowerPrice") int lowestPrice, @RequestParam("upperPrice") int highestPrice,
                             @RequestParam("lowerYear") int oldest, @RequestParam("upperYear") int newest,
                             @RequestParam("brand") String brand, @RequestParam("type") String type){
        return "Looking for car\n" +
                "price: "+Integer.toString(lowestPrice)+" - "+Integer.toString(lowestPrice)+"\n"+
                "year: "+Integer.toString(oldest)+" - "+Integer.toString(newest)+"\n"+
                "brand: "+brand+
                "type: "+type;
    }

}
