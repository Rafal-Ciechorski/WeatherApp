package com.example.weatherapp.service;

import com.example.weatherapp.dto.WeatherDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class WeatherService {

    private RestTemplate restTemplate = new RestTemplate();

    private static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/";
    private static final String API_KEY = "502e5f321e0e0e548235305eaa2f3c1d";
    private static final String CITY = "Warsaw";

    public WeatherDto getWeather()
    {
        String response = restTemplate.getForObject(WEATHER_URL+"weather?q={city}&appid={api_key}&units=metric",String.class, CITY, API_KEY);
        log.info(response);
        return null;
    }
}
