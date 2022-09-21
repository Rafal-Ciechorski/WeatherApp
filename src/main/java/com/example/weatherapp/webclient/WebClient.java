package com.example.weatherapp.webclient;

import com.example.weatherapp.dtos.OpenWeatherDto;
import com.example.weatherapp.model.WeatherDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WebClient {

    private RestTemplate restTemplate = new RestTemplate();
    private static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/";
    private static final String API_KEY = "502e5f321e0e0e548235305eaa2f3c1d";


    public WeatherDto getWeatherForCity(String city)
    {
        OpenWeatherDto openWeatherDto = restTemplate.getForObject(WEATHER_URL+"weather?q={city}&appid={api_key}&units=metric",OpenWeatherDto.class, city, API_KEY);

        return WeatherDto.builder()
                .humidity(openWeatherDto.getMain().getHumidity())
                .pressure(openWeatherDto.getMain().getPressure())
                .temperature(openWeatherDto.getMain().getTemperature())
                .wind_speed(openWeatherDto.getWind().getWind_speed())
                .build();
    }
}
