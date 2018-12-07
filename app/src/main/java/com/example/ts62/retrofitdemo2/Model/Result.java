package com.example.ts62.retrofitdemo2.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

@SerializedName("items")
@Expose
private List<VehicleModel> items = null;

public List<VehicleModel> getItems() {
return items;
}

public void setItems(List<VehicleModel> vehicleModels) {
this.items = vehicleModels;
}

}