package com.example.weatherapp.dtos;

import lombok.Getter;

@Getter
public class OpenWeatherDto {
    private OpenWeatherMainDto main;
    private OpenWeatherWindDto wind;
}
