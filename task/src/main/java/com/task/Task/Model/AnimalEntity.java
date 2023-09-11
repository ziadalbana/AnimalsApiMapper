package com.task.Task.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "animals")
public class AnimalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "taxonomy_Id", referencedColumnName = "id")
    private Taxonomy taxonomy;
    @Column
    private String  locations;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "characteristics_Id", referencedColumnName = "id")
    private Characteristics characteristics;

    public AnimalEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Taxonomy getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(Taxonomy taxonomy) {
        this.taxonomy = taxonomy;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<String> locations) {
        this.locations = locations.toString();
    }


    public Characteristics getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characteristics characteristics) {
        this.characteristics = characteristics;
    }

    @Override
    public String toString() {
        return "AnimalEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxonomy=" + taxonomy +
                ", location='" + getLocations().toString() + '\'' +
                ", characteristics=" + characteristics +
                '}';
    }
}
