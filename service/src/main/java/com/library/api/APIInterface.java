package com.library.api;

import com.library.model.request.CurrentLocation;
import com.library.model.response.ResponseDetailList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by tariq on 02/05/17.
 */

public interface APIInterface {

    @POST("/details")
    Call<ResponseDetailList> getLocationDetails(@Body CurrentLocation currentLocation);
}
