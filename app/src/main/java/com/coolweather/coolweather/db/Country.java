package com.coolweather.coolweather.db;

import org.litepal.crud.LitePalSupport;

public class Country extends LitePalSupport {

    private int id;

    // 县的名字
    private String countryName;

    // 县对应的天气id
    private String weatherId;

    // 所属的城市id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
