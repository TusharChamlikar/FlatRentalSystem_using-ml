package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="FORAI")
public class AI {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String ai;
    public AI(){

    }
    public AI(String ai){
        this.ai=ai;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAi() {
        return ai;
    }
    public void setAi(String ai) {
        this.ai = ai;
    }
}
