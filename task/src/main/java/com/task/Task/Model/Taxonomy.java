package com.task.Task.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "taxonomy")
public class Taxonomy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String kingdom;
    @Column
    private String phylum;

    @JsonProperty("class")
    @Column(name = "class")
    private String classOFAnimal;
    @Column(name = "order_num")
    private String order;
    @Column
    private String family;
    @Column
    private String genus;
    @Column
    private String scientific_name;

    public Taxonomy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public String getClassOFAnimal() {
        return classOFAnimal;
    }

    public void setClassOFAnimal(String classOFAnimal) {
        this.classOFAnimal = classOFAnimal;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getScientific_name() {
        return scientific_name;
    }

    public void setScientific_name(String scientific_name) {
        this.scientific_name = scientific_name;
    }
}
