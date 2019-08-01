package com.linjunhao.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author: created by linjunhao
 * @date: 2019/8/1 18:07
 * @description:
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
