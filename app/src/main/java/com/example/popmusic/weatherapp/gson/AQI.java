package com.example.popmusic.weatherapp.gson;

/**
 * Created by popmusic on 17-2-7.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
