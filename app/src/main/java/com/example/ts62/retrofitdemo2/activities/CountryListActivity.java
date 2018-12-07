package com.example.ts62.retrofitdemo2.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.ts62.retrofitdemo2.Adapter.CountryAdapter;
import com.example.ts62.retrofitdemo2.Model.CountryModel;
import com.example.ts62.retrofitdemo2.R;
import com.example.ts62.retrofitdemo2.request.CountryRequest;
import com.example.ts62.retrofitdemo2.response.CountryResponse;
import com.example.ts62.retrofitdemo2.rest.ApiClient;
import com.example.ts62.retrofitdemo2.rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CountryListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    CountryAdapter adapter;
    List<CountryModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_list);

        recyclerView = findViewById(R.id.rvList);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        CountryRequest countryRequest = new CountryRequest();
        countryRequest.setUserId(19);

        Call<CountryResponse> call = apiInterface.getCountryDetail(countryRequest);
        call.enqueue(new Callback<CountryResponse>() {
            @Override
            public void onResponse(Call<CountryResponse> call, Response<CountryResponse> response) {
                list = response.body().getResult().getItems();
                adapter = new CountryAdapter(list,CountryListActivity.this);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<CountryResponse> call, Throwable t) {
                Log.e("response",t.toString());
            }
        });

    }
}
