package com.example.ts62.retrofitdemo2;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.ts62.retrofitdemo2.Adapter.VehicleAdapter;
import com.example.ts62.retrofitdemo2.Model.Item;
import com.example.ts62.retrofitdemo2.Model.VehicleResponse;
import com.example.ts62.retrofitdemo2.Model.VehiclerRequest;
import com.example.ts62.retrofitdemo2.rest.ApiClient;
import com.example.ts62.retrofitdemo2.rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String API_KEY = "AIzaSyCEkCWuUOA6swNlGK7y6sGpBDDEHl6SC04";
    private RecyclerView recyclerView;

    List<Item> vehicleList = new ArrayList<>();
    VehicleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        loadVehicleList();
    }

    private void loadVehicleList() {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        VehiclerRequest request = new VehiclerRequest();
        request.setUserId(19);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        retrofit2.Call<VehicleResponse> call = apiService.getVehicleDetail(request);
        call.enqueue(new Callback<VehicleResponse>() {
            @Override
            public void onResponse(retrofit2.Call<VehicleResponse> call, Response<VehicleResponse> response) {
                Log.e("response", response.body().toString());

                vehicleList = response.body().getResult().getItems();
                if (vehicleList == null || vehicleList.size() == 0)
                    return;
                adapter = new VehicleAdapter(vehicleList, MainActivity.this);
                recyclerView.setAdapter(adapter);

//                for (int i = 0; i < vehicleList.size(); i++) {
//                    Item vehicleModel = vehicleList.get(i);
//                    Log.e("Vehicle", String.valueOf(vehicleModel.getVehicleId()));
//                    Log.e("Vehicle", String.valueOf(vehicleModel.getVehicleMaker()));
//                    Log.e("Vehicle", String.valueOf(vehicleModel.getVehicleModel()));
//                    Log.e("Vehicle", String.valueOf(vehicleModel.getVehicleRegistrationNumber()));
//                    Log.e("Vehicle", String.valueOf(vehicleModel.getVehicleTypeId()));
//                    Log.e("Vehicle", String.valueOf(vehicleModel.getNameofOwner()));
//                }
            }

            @Override
            public void onFailure(retrofit2.Call<VehicleResponse> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });

    }
}
