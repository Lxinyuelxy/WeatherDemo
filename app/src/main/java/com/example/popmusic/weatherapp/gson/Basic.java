package com.example.popmusic.weatherapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by popmusic on 17-2-7.
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
