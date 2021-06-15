package com.example.h2zoo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Bird {

    @Id
    @GeneratedValue

    private Long Id;
    private final String name;
    private final String species;
    private final String color;
    private final String dietType;

    public Bird(String name, String species, String color, String dietType) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.dietType = dietType;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public String getDietType() {
        return dietType;
    }
}
