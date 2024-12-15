package com.example.demo;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PredictionService{

    public Double getPredictedPrice(String houseType, Double houseSize, String location, String city, String amenities) {
        String url = "http://localhost:5000/predict";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        JSONObject request = new JSONObject();
        request.put("house_type", houseType);
        request.put("house_size", houseSize);
        request.put("location", location);
        request.put("city", city);
        request.put("amenities", amenities);

        HttpEntity<String> entity = new HttpEntity<>(request.toString(), headers);

        ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);
        JSONObject responseBody = new JSONObject(response.getBody());

        return responseBody.getDouble("predicted_price");
    }
}

