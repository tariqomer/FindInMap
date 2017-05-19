package com.library.model.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tariq on 02/05/17.
 */

public class ResponseDetail {

    @SerializedName("Longitude")
    private String longitude;

    @SerializedName("Latitude")
    private  String latitude;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
