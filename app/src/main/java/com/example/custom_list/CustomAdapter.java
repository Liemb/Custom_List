package com.example.custom_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String cityList[];
    int symbols[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] cityList, int[] symbols, String[] capital) {
        this.context = context;
        this.cityList = cityList;
        this.symbols = symbols;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return cityList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_lv_layout, null);
        TextView city = (TextView) view.findViewById(R.id.tV);
        ImageView symbol = (ImageView) view.findViewById(R.id.iV);
        city.setText(cityList[i]);
        symbol.setImageResource(symbols[i]);
        return view;
    }
}

