package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@RestController
public class WeatherController {

    @GetMapping("/weather")
    public WeatherResponse getWeather() {

        try {
            String apiKey = "76b99b61752d646027d2a16a3630bf4b";


            String url = "https://api.openweathermap.org/data/2.5/weather?q=Cape%20Town&appid="
                    + apiKey + "&units=metric";

            RestTemplate restTemplate = new RestTemplate();

            Map<String, Object> response = restTemplate.getForObject(url, Map.class);

            String city = (String) response.get("name");

            Map<String, Object> main = (Map<String, Object>) response.get("main");
            double temp = ((Number) main.get("temp")).doubleValue();

            List<Map<String, Object>> weatherList =
                    (List<Map<String, Object>>) response.get("weather");

            String description = (String) weatherList.get(0).get("description");

            return new WeatherResponse(city, temp, description);

        } catch (Exception e) {
            return new WeatherResponse("ERROR", 0, e.getMessage());
        }
    }
}