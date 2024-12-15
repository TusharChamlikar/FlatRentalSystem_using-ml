package com.example.demo;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prediction")
public class Predict {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String house;
    private double housesize;
    private String location;
    private String city;
    private String amenities;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getHouse() {
        return house;
    }
    public void setHouse(String house) {
        this.house = house;
    }
    public double getHousesize() {
        return housesize;
    }
    public void setHousesize(double housesize) {
        this.housesize = housesize;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAmenities() {
        return amenities;
    }
    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

}
