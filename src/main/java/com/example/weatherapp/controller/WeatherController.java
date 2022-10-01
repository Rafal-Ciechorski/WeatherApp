package com.example.weatherapp.controller;

import com.example.weatherapp.dtos.OpenWeatherCityDto;
import com.example.weatherapp.model.WeatherDto;
import com.example.weatherapp.model.WeatherPostDto;
import com.example.weatherapp.service.WeatherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class WeatherController {

    private final WeatherService weatherService;
    String city = "Warszawa";

    @GetMapping("/weather/{city}")
    @CrossOrigin
    private WeatherDto getWeather(@PathVariable String city)
    {
        log.info(city);
        return weatherService.getWeather(city);
    }

    @PostMapping("/weatherPost")
    @CrossOrigin
    private String getCity(@RequestBody OpenWeatherCityDto openWeatherCityDto){
       String bis = weatherService.getWeatherFromPojo(openWeatherCityDto);
        return "bis";
    }

}
