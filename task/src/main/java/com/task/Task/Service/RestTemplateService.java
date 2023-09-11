package com.task.Task.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.task.Task.Constants.URLs;
import com.task.Task.Constants.Header;
import com.task.Task.Model.AnimalEntity;
import com.task.Task.Model.Animals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
@Service
public class RestTemplateService {
    @Autowired
    private RestTemplate restTemplate;
    private final String ANIMALS_API = URLs.ANIMALS_API;
    private final String X_Api_Key = Header.X_Api_Key;
    public List<AnimalEntity> getAnimalsApiResponse(String searchName) throws IOException {
        URL url1 = new URL(ANIMALS_API+searchName);
        HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("x-api-key", X_Api_Key);
        InputStream inputStream = connection.getInputStream();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(inputStream);
        ArrayList<AnimalEntity> animalList = new ArrayList<>();
        for (JsonNode node : jsonNode) {
            animalList.add(objectMapper.readValue(node.toString(), AnimalEntity.class));
        }
        return animalList;
    }
}
