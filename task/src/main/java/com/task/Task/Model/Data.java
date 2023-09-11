package com.task.Task.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Data {
    @JsonProperty("data")
    private Animals animals;

    public Data() {
    }

    public Data(Animals animals) {
        this.animals = animals;
    }

    public Animals getAnimals() {
        return animals;
    }

    public void setAnimals(Animals animals) {
        this.animals = animals;
    }
}
