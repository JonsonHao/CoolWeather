package com.linjunhao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author: created by linjunhao
 * @date: 2019/8/1 20:32
 * @description:
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
