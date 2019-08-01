package com.linjunhao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author: created by linjunhao
 * @date: 2019/8/1 20:37
 * @description:
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }
}
