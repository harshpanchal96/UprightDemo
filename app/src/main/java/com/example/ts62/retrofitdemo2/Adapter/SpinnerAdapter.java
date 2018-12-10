package com.example.ts62.retrofitdemo2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ts62.retrofitdemo2.R;


public class SpinnerAdapter extends BaseAdapter {
    Context context;
    String[] countryName;
    String[] countrCode;

    public SpinnerAdapter(Context context, String[] countryName, String[] countrCode) {
        this.context = context;
        this.countryName = countryName;
        this.countrCode = countrCode;
    }


    @Override
    public int getCount() {
        return countryName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_spinner, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.tv_country_name);
        TextView code = (TextView) convertView.findViewById(R.id.tv_country_code);
        name.setText(countryName[position]);
        code.setText(countrCode[position]);
        return convertView;
    }
}
