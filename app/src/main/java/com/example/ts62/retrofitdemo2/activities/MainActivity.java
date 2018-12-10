package com.example.ts62.retrofitdemo2.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.ts62.retrofitdemo2.R;
import com.example.ts62.retrofitdemo2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setPresenter(this);

    }

    public void OnVehicelClick() {
        Intent intent = new Intent(this, VehicleListActivity.class);
        startActivity(intent);
    }

    public void OnCountryClick() {
        Intent intent = new Intent(this, CountryListActivity.class);
        startActivity(intent);
    }

    public void OnSignUpClick() {
        Intent i = new Intent(this, SingnUpActivity.class);
        startActivity(i);

    }
}
