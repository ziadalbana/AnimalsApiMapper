package com.task.Task.Service;

import com.task.Task.DAO.AnimalEntityRepository;
import com.task.Task.Model.AnimalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnimalEntityService  {
    @Autowired
    private AnimalEntityRepository animalEntityRepository;
    public void saveAnimal(AnimalEntity animalEntity){
         animalEntityRepository.save(animalEntity);
    }
    public void saveAnimals(List<AnimalEntity> animalEntities){
        for(AnimalEntity entity:animalEntities){
            animalEntityRepository.save(entity);
        }
    }
    public AnimalEntity getAnimalById(String id){
        return animalEntityRepository.findById(id).get();
    }
    public void deleteAnimalById(String id){
        animalEntityRepository.deleteById(id);
    }
    public List<AnimalEntity> getAllAnimals(){
        return animalEntityRepository.findAll();
    }
}
