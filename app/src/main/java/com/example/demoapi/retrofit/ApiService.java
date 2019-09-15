package com.example.demoapi.retrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {
    @FormUrlEncoded
    @POST("sms/send")
    Call<MessageModel> getSignUpResponse(@Field("applicationId") String applicationID,
                                         @Field("password") String password,
                                         @Field("message") String message,
                                         @Field("destinationAddresses") String destAddd);


}
