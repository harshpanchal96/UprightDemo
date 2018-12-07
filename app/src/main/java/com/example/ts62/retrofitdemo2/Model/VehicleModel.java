package com.example.ts62.retrofitdemo2.Model;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VehicleModel {

    @SerializedName("VehicleId")
    @Expose
    private int vehicleId;
    @SerializedName("VehicleTypeId")
    @Expose
    private int vehicleTypeId;
    @SerializedName("VehicleMaker")
    @Expose
    private String vehicleMaker;
    @SerializedName("VehicleModel")
    @Expose
    private String vehicleModel;
    @SerializedName("VehicleRegistrationNumber")
    @Expose
    private String vehicleRegistrationNumber;
    @SerializedName("NameofOwner")
    @Expose
    private String nameofOwner;
    @SerializedName("Url")
    @Expose
    private String url;

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(Integer vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public String getVehicleMaker() {
        return vehicleMaker;
    }

    public void setVehicleMaker(String vehicleMaker) {
        this.vehicleMaker = vehicleMaker;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }

    public String getNameofOwner() {
        return nameofOwner;
    }

    public void setNameofOwner(String nameofOwner) {
        this.nameofOwner = nameofOwner;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
@BindingAdapter({"android:Url"})
public static void loadImage(ImageView view,String imageUrl){
    Glide.with(view.getContext())
            .load(imageUrl)
            .into(view);
}

    @Override
    public String toString() {
        return super.toString();
    }
}