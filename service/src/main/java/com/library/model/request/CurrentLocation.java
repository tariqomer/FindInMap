package com.library.model.request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tariq on 02/05/17.
 */

public class CurrentLocation {

    @SerializedName("Current_Longitude")
    private String currentLongitude;

    @SerializedName("Current_Latitude")
    private  String currentLatitude;

    public String getCurrentLongitude() {
        return currentLongitude;
    }

    public void setCurrentLongitude(String currentLongitude) {
        this.currentLongitude = currentLongitude;
    }

    public String getCurrentLatitude() {
        return currentLatitude;
    }

    public void setCurrentLatitude(String currentLatitude) {
        this.currentLatitude = currentLatitude;
    }
}
