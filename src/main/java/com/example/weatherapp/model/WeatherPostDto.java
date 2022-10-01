package com.example.weatherapp.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WeatherPostDto {

    private String city;

    public WeatherPostDto(String city) {
        this.city = city;
    }
}
