package com.mycoolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gxs on 2017-08-04.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
