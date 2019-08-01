package com.linjunhao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author: created by linjunhao
 * @date: 2019/8/1 20:40
 * @description:
 */
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
