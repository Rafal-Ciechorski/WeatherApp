package com.example.weatherapp.controller;

import com.example.weatherapp.dto.WeatherDto;
import com.example.weatherapp.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/weather")
    private WeatherDto getWeather()
    {

        return weatherService.getWeather();
    }
}
