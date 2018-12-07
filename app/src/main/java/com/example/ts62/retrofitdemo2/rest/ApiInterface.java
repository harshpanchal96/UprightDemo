package com.example.ts62.retrofitdemo2.rest;

import com.example.ts62.retrofitdemo2.request.CountryRequest;
import com.example.ts62.retrofitdemo2.response.CountryResponse;
import com.example.ts62.retrofitdemo2.response.VehicleResponse;
import com.example.ts62.retrofitdemo2.request.VehiclerRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("GetVehicleDetails")
    Call<VehicleResponse> getVehicleDetail(@Body VehiclerRequest request);

    @POST("GetCountryDetails")
    Call<CountryResponse> getCountryDetail(@Body CountryRequest request);
}
