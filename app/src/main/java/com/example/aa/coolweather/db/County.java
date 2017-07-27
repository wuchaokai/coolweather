package com.example.aa.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by aa on 2017/7/25.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountyName(String countryName) {
        this.countyName = countryName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
