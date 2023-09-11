package com.task.Task.Service;

import com.task.Task.Model.AnimalEntity;
import com.task.Task.Model.Animals;
import com.task.Task.Model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Service
public class RequestHandlerService {
    @Autowired
    private AnimalEntityService animalEntityService;
   @Autowired
    private RestTemplateService restTemplateService;

    public Data animalsApiRequestHandler(String searchString) throws IOException {
        List<AnimalEntity> entityList=restTemplateService.getAnimalsApiResponse(searchString);
        animalEntityService.saveAnimals(entityList);
        Animals animals=new Animals((ArrayList<AnimalEntity>) entityList);
        return new Data(animals);
    }
}
