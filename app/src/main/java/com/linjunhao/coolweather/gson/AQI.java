package com.linjunhao.coolweather.gson;

/**
 * @author: created by linjunhao
 * @date: 2019/8/1 20:31
 * @description:
 */
public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }
}
