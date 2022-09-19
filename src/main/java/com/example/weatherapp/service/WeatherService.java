package com.example.weatherapp.service;

import com.example.weatherapp.model.WeatherDto;
import com.example.weatherapp.webclient.WebClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class WeatherService {

    private final WebClient webClient = new WebClient();

    public WeatherDto getWeather()
    {

        String response = webClient.getWeatherForCity("Warsaw",String.class);
        log.info(response);
        return null;
    }


}
