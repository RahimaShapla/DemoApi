package com.example.demoapi.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MessageModel {

    @SerializedName("statusCode")
    @Expose
    public String statusCode;

    @SerializedName("requestId")
    @Expose
    public String requestCode;

    @SerializedName("statusDetail")
    @Expose
    public String statusDetails;

    @SerializedName("destinationResponses")
    @Expose
    public List<DestinationModel> destinationModelList;

    @SerializedName("messageId")
    @Expose
    public String version;
}
