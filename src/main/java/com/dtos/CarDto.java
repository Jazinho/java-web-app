package com.dtos;

import com.values.CarType;

/**
 * @author Jan Pałucki
 */

public class CarDto {
    private Long id;
    private CarType type;
    private int price;
    private int productionYear;
    private int passedKms;
    private String brand;
    private String model;

    public CarDto() {
    }

    public CarDto(CarType type, int price, int productionYear, int passedKms, String brand, String model) {
        this.type = type;
        this.price = price;
        this.productionYear = productionYear;
        this.passedKms = passedKms;
        this.brand = brand;
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPassedKms() {
        return passedKms;
    }

    public void setPassedKms(int passedKms) {
        this.passedKms = passedKms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "Car:\n" +
                "brand: " + brand + "\n" +
                "model: " + model +
                "price: " + Integer.toString(price) + "\n" +
                "year: " + Integer.toString(productionYear) + "\n" +
                "passedKms: " + Integer.toString(passedKms) + "\n" +
                "type: " + type + "\n";
    }
}
