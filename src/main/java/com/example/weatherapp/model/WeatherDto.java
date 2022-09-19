package com.example.weatherapp.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WeatherDto {

    private float temperature;
    private int humidity;
    private int pressure;
    private float wind_speed;

}
