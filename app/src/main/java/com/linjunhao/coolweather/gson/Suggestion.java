package com.linjunhao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author: created by linjunhao
 * @date: 2019/8/1 20:34
 * @description:
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }
}
