package com.example.demo.POST;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="flatrecords")
public class post {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int flatnumber;
    private String address;
    private int size;
    private int  numberofrooms;
    private String amenities;
    private int rent;
    private int securitydeposit;
    private String status;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getFlatnumber() {
        return flatnumber;
    }
    public void setFlatnumber(int flatnumber) {
        this.flatnumber = flatnumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getNumberofrooms() {
        return numberofrooms;
    }
    public void setNumberofrooms(int numberofrooms) {
        this.numberofrooms = numberofrooms;
    }
    public String getAmenities() {
        return amenities;
    }
    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }
    public int getRent() {
        return rent;
    }
    public void setRent(int rent) {
        this.rent = rent;
    }
    public int getSecuritydeposit() {
        return securitydeposit;
    }
    public void setSecuritydeposit(int securitydeposit) {
        this.securitydeposit = securitydeposit;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
