package com.example.weatherapp.webclient;

import com.example.weatherapp.dtos.OpenWeatherCityDto;
import com.example.weatherapp.dtos.OpenWeatherDto;
import com.example.weatherapp.model.WeatherDto;
import com.example.weatherapp.model.WeatherPostDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class WebClient {

    private RestTemplate restTemplate = new RestTemplate();
    private static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/";
    private static final String API_KEY = "502e5f321e0e0e548235305eaa2f3c1d";


    public WeatherDto getWeatherForCity(String city)
    {
        OpenWeatherDto openWeatherDto = restTemplate.getForObject(WEATHER_URL+"weather?q={city}&appid={api_key}&units=metric",OpenWeatherDto.class, city, API_KEY);

        String s = WeatherDto.builder().humidity(openWeatherDto.getMain().getHumidity()).toString();
        log.info("ssss"+s);
        return WeatherDto.builder()
                .humidity(openWeatherDto.getMain().getHumidity())
                .pressure(openWeatherDto.getMain().getPressure())
                .temperature(openWeatherDto.getMain().getTemp())
                .wind_speed(openWeatherDto.getWind().getSpeed())
                .build();
    }

    public String getWeatherFromPojo(OpenWeatherCityDto openWeatherCityDto)
    {
        return openWeatherCityDto.getCity();
    }


}
