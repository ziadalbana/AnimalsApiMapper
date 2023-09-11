package com.task.Task.Controller;

import com.task.Task.Model.AnimalEntity;
import com.task.Task.Model.Animals;
import com.task.Task.Model.Data;
import com.task.Task.Service.AnimalEntityService;
import com.task.Task.Service.RequestHandlerService;
import com.task.Task.Service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/animals")
public class AnimalsController {
    @Autowired
    private AnimalEntityService animalEntityService;
    @Autowired
    private RequestHandlerService requestHandlerService;

    @GetMapping
    public Data getAnimal(){
        List<AnimalEntity> list=animalEntityService.getAllAnimals();
        Animals animals=new Animals((ArrayList<AnimalEntity>) list);
        return new Data(animals);
    }
    @GetMapping("/{searchName}")
    public Data getAnimalsByName(@PathVariable String searchName) throws IOException {
        return requestHandlerService.animalsApiRequestHandler(searchName);
    }
}
