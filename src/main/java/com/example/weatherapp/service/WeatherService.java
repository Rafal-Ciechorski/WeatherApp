package com.example.weatherapp.service;

import com.example.weatherapp.controller.WeatherController;
import com.example.weatherapp.dtos.OpenWeatherCityDto;
import com.example.weatherapp.model.WeatherDto;
import com.example.weatherapp.model.WeatherPostDto;
import com.example.weatherapp.webclient.WebClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class WeatherService {

    private final WebClient webClient = new WebClient();

    public WeatherDto getWeather(String city)
    {

        log.info(city);
        return webClient.getWeatherForCity(city);
    }

    public String getWeatherFromPojo(OpenWeatherCityDto openWeatherCityDto)
    {
        return openWeatherCityDto.getCity();
        //return getWeather(openWeatherCityDto.getCity());
    }

}
