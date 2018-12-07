package com.example.ts62.retrofitdemo2.Model;

import android.content.ClipData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CountryResult {

@SerializedName("items")
@Expose
private List<CountryModel> items = null;

public List<CountryModel> getItems() {
return items;
}

public void setItems(List<CountryModel> items) {
this.items = items;
}

}