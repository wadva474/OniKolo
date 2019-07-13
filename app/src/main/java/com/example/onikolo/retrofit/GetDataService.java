package com.example.onikolo.retrofit;

import com.example.onikolo.model.LogIn;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GetDataService {
    @POST("/login")
    Call<LogIn> login (@Field("username")String username,@Field("passwowrd")String Password);
}
