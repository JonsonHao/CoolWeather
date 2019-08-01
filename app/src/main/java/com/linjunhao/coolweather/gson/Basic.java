package com.linjunhao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author: created by linjunhao
 * @date: 2019/8/1 20:29
 * @description:
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
