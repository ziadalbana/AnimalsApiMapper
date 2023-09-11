package com.task.Task.Model;

import java.util.ArrayList;

public class Animals {

    ArrayList<AnimalEntity> animals;

    public Animals() {
    }

    public Animals(ArrayList<AnimalEntity> animals) {
        this.animals = animals;
    }

    public ArrayList<AnimalEntity> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<AnimalEntity> animals) {
        this.animals = animals;
    }
}
