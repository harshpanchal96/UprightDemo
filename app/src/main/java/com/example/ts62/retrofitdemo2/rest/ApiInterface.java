package com.example.ts62.retrofitdemo2.rest;

import com.example.ts62.retrofitdemo2.Model.VehicleResponse;
import com.example.ts62.retrofitdemo2.Model.VehiclerRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @POST("GetVehicleDetails")
    Call<VehicleResponse> getVehicleDetail(@Body VehiclerRequest request);
}
