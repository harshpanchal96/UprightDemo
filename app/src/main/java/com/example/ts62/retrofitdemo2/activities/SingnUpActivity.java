package com.example.ts62.retrofitdemo2.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import com.example.ts62.retrofitdemo2.Adapter.SpinnerAdapter;
import com.example.ts62.retrofitdemo2.Model.CountryModel;
import com.example.ts62.retrofitdemo2.Model.UserModel;
import com.example.ts62.retrofitdemo2.R;
import com.example.ts62.retrofitdemo2.databinding.ActivitySingnUpBinding;
import com.example.ts62.retrofitdemo2.request.CountryRequest;
import com.example.ts62.retrofitdemo2.request.SignUpRequest;
import com.example.ts62.retrofitdemo2.response.CountryResponse;
import com.example.ts62.retrofitdemo2.response.SignUpResponse;
import com.example.ts62.retrofitdemo2.rest.ApiClient;
import com.example.ts62.retrofitdemo2.rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import retrofit2.Callback;
import retrofit2.Response;

public class SingnUpActivity extends AppCompatActivity {
    public ActivitySingnUpBinding binding;
    public SpinnerAdapter spinnerAdapter;
    List<CountryModel> list = new ArrayList<CountryModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_singn_up);

        final ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        final SignUpRequest request = new SignUpRequest();
        final CountryRequest countryRequest = new CountryRequest();


        final Spinner spinner = (Spinner) findViewById(R.id.spn_numid);

        retrofit2.Call<SignUpResponse> call = apiInterface.getSignupDetail(request);
        call.enqueue(new Callback<SignUpResponse>() {
            @Override
            public void onResponse(retrofit2.Call<SignUpResponse> call, Response<SignUpResponse> response) {
                UserModel userModel = new UserModel();
                spinner.setAdapter(spinnerAdapter);

            }

            @Override
            public void onFailure(retrofit2.Call<SignUpResponse> call, Throwable t) {

            }
        });
        retrofit2.Call<CountryResponse> countryDetail = apiInterface.getCountryDetail(countryRequest);
        countryDetail.enqueue(new Callback<CountryResponse>() {
            @Override
            public void onResponse(retrofit2.Call<CountryResponse> call, Response<CountryResponse> response) {
                list = response.body().getResult().getItems();
                spinner.setAdapter(spinnerAdapter);
            }

            @Override
            public void onFailure(retrofit2.Call<CountryResponse> call, Throwable t) {

            }
        });

    }
}
