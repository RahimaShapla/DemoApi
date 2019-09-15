package com.example.demoapi.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DestinationModel {

    @SerializedName("statusCode")
    @Expose
    public String statusCode;

    @SerializedName("timeStamp")
    @Expose
    public String timeStamp;

    @SerializedName("statusDetail")
    @Expose
    public String statusDetails;

    @SerializedName("messageId")
    @Expose
    public String messaheId;
}