package com.linjunhao.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author: created by linjunhao
 * @date: 2019/8/1 17:57
 * @description:
 */
public class Province extends DataSupport{

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
