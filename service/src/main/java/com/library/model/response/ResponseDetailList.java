package com.library.model.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tariq on 02/05/17.
 */

public class ResponseDetailList {

    @SerializedName("Response_List")
    private List<ResponseDetail> responseDetail;

    public List<ResponseDetail> getResponse() {
        return responseDetail;
    }

    public void setResponse(List<ResponseDetail> responseDetail) {
        this.responseDetail = responseDetail;
    }
}
