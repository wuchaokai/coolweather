package com.example.aa.coolweather.gson;

/**
 * Created by aa on 2017/7/27.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
