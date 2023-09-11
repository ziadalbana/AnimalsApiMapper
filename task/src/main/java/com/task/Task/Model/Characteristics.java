package com.task.Task.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.*;

import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "characteristics")
public class Characteristics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String prey;
    @Column
    private String name_of_young;
    @Column
    private String  group_behavior;
    @Column
    private String  estimated_population_size;
    @Column
    private String  biggest_threat;
    @Column
    private String  most_distinctive_feature;
    @Column
    private String  gestation_period;
    @Column
    private String  habitat;
    @Column
    private String  diet;
    @Column
    private String  average_litter_size;
    @Column
    private String  lifestyle;
    @Column
    private String  common_name;
    @Column
    private String  number_of_species;
    @Column
    private String  location;
    @Column
    private String  slogan;
    @Column(name = "group_name")
    private String group;
    @Column
    private String  color;
    @Column
    private String  skin_type;
    @Column
    private String  top_speed;
    @Column
    private String  lifespan;
    @Column
    private String  weight;
    @Column
    private String  height;
    @Column
    private String  age_of_sexual_maturity;
    @Column
    private String  age_of_weaning;
    @Transient
    private Map<String, Object> optional = new HashMap<>();

    public Characteristics() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrey() {
        return prey;
    }

    public void setPrey(String prey) {
        this.prey = prey;
    }

    public String getName_of_young() {
        return name_of_young;
    }

    public void setName_of_young(String name_of_young) {
        this.name_of_young = name_of_young;
    }

    public String getGroup_behavior() {
        return group_behavior;
    }

    public void setGroup_behavior(String group_behavior) {
        this.group_behavior = group_behavior;
    }

    public String getEstimated_population_size() {
        return estimated_population_size;
    }

    public void setEstimated_population_size(String estimated_population_size) {
        this.estimated_population_size = estimated_population_size;
    }

    public String getBiggest_threat() {
        return biggest_threat;
    }

    public void setBiggest_threat(String biggest_threat) {
        this.biggest_threat = biggest_threat;
    }

    public String getMost_distinctive_feature() {
        return most_distinctive_feature;
    }

    public void setMost_distinctive_feature(String most_distinctive_feature) {
        this.most_distinctive_feature = most_distinctive_feature;
    }

    public String getGestation_period() {
        return gestation_period;
    }

    public void setGestation_period(String gestation_period) {
        this.gestation_period = gestation_period;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getAverage_litter_size() {
        return average_litter_size;
    }

    public void setAverage_litter_size(String average_litter_size) {
        this.average_litter_size = average_litter_size;
    }

    public String getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(String lifestyle) {
        this.lifestyle = lifestyle;
    }

    public String getCommon_name() {
        return common_name;
    }

    public void setCommon_name(String common_name) {
        this.common_name = common_name;
    }

    public String getNumber_of_species() {
        return number_of_species;
    }

    public void setNumber_of_species(String number_of_species) {
        this.number_of_species = number_of_species;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSkin_type() {
        return skin_type;
    }

    public void setSkin_type(String skin_type) {
        this.skin_type = skin_type;
    }

    public String getTop_speed() {
        return top_speed;
    }

    public void setTop_speed(String top_speed) {
        this.top_speed = top_speed;
    }

    public String getLifespan() {
        return lifespan;
    }

    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAge_of_sexual_maturity() {
        return age_of_sexual_maturity;
    }

    public void setAge_of_sexual_maturity(String age_of_sexual_maturity) {
        this.age_of_sexual_maturity = age_of_sexual_maturity;
    }

    public String getAge_of_weaning() {
        return age_of_weaning;
    }

    public void setAge_of_weaning(String age_of_weaning) {
        this.age_of_weaning = age_of_weaning;
    }
    @JsonAnySetter
    public void addOptional(String name, Object value) {
        optional.put(name, value);
    }
    @JsonAnyGetter
    public Object getOptional(String name) {
        return optional.get(name);
    }
}
