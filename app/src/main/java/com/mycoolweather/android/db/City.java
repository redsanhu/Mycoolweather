package com.mycoolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by gxs on 2017-08-03.
 */

public class City extends DataSupport {
    private int id;
    private String CityName;
    private int CityCode;
    private int provinceId;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getCityCode() {
        return CityCode;
    }

    public void setCityCode(int cityCode) {
        CityCode = cityCode;
    }
}
