package com.entities;

import com.values.CarType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CarEntity Entity
 */

@Entity
@Table(name = "samochody")
public class CarEntity {

    @Id
    private Long id;

    @Column(name = "cena", nullable = false)
    private int price;

    @Column(name = "rok_produkcji", nullable = false)
    private int productionYear;

    @Column(name = "przejechaneKm", nullable = false)
    private int passedKms;

    @Column(name = "marka", nullable = false)
    private String brand;

    @Column(name = "typ_samochodu", nullable = false)
    private CarType type;

    @Column(name = "model", nullable = false)
    private String model;

    protected CarEntity() {
    }

    public CarEntity(int price, Long id, int productionYear, int passedKms, String marka, CarType type, String model) {
        this.price = price;
        this.id = id;
        this.productionYear = productionYear;
        this.passedKms = passedKms;
        this.brand = marka;
        this.type = type;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getPassedKms() {
        return passedKms;
    }

    public void setPassedKms(int passedKms) {
        this.passedKms = passedKms;
    }

    public String getMarka() {
        return brand;
    }

    public void setMarka(String marka) {
        this.brand = marka;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType typ) {this.type = typ;}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
