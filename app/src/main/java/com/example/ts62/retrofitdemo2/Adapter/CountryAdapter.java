package com.example.ts62.retrofitdemo2.Adapter;

import android.content.ClipData;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ts62.retrofitdemo2.Model.CountryModel;
import com.example.ts62.retrofitdemo2.R;
import com.example.ts62.retrofitdemo2.databinding.CountryListBinding;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.MyViewHolder> {
    private List<CountryModel> items;
    private Context context;

    public CountryAdapter(List<CountryModel> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public CountryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.country_list, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryAdapter.MyViewHolder myViewHolder, int i) {
        CountryModel item = this.items.get(i);
        myViewHolder.binding.setCountry(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CountryListBinding binding;
        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
}