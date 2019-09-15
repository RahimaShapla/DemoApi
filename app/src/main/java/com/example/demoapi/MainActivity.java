package com.example.demoapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.demoapi.retrofit.ApiService;
import com.example.demoapi.retrofit.MessageModel;
import com.example.demoapi.retrofit.RetroClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ApiService apiService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiService = RetroClient.getClient().create(ApiService.class);
        Call<MessageModel> call = apiService.getSignUpResponse("APP_000027","10d8769c825f4aad0c511dfe3de3f121","Sample Message", "[\"tel:8801812345678");
        call.enqueue(new Callback<MessageModel>() {
            @Override
            public void onResponse(Call<MessageModel> call, Response<MessageModel> response) {
                if(response.isSuccessful()){
                    Toast.makeText(MainActivity.this,"Message is sent", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<MessageModel> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Message is not sent", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
