package com.mycoolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gxs on 2017-08-04.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
