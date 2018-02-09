package com.example.tenkiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ngx20 on 2018/2/9.
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
