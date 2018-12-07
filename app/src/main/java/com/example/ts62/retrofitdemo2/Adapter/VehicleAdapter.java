package com.example.ts62.retrofitdemo2.Adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ts62.retrofitdemo2.Model.VehicleModel;
import com.example.ts62.retrofitdemo2.R;
import com.example.ts62.retrofitdemo2.databinding.VehicleListItemBinding;


import java.util.List;

public class VehicleAdapter extends RecyclerView.Adapter<VehicleAdapter.MyViewHolder> {
    private List<VehicleModel> items;
    private Context context;

    public VehicleAdapter(List<VehicleModel> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vehicle_list_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
//        myViewHolder.binding.setText("Test text");
        VehicleModel vehicleModel = this.items.get(i);

        Log.e("Adapter", vehicleModel.toString());

        myViewHolder.binding.setVehicle(vehicleModel);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        VehicleListItemBinding binding;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
}
