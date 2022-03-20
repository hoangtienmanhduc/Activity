package com.example.activitya.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.activitya.R;

import com.example.activitya.activity.Activity2;
import com.example.activitya.model.Languageactivity;

import java.util.ArrayList;
import java.util.List;

public class AdapterActivity extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Languageactivity> listLanguage;
    private int positionSelect = -1;
//    private ArrayList<Languageactivity> arrayListLanguage;

    public AdapterActivity(Context context, int idLayout, List<Languageactivity> listLanguage) {
        this.context = context;
        this.idLayout = idLayout;
        this.listLanguage = listLanguage;
    }

    @Override
    public int getCount() {
        if (listLanguage.size() != 0 && !listLanguage.isEmpty()) {
            return listLanguage.size();
        }
        return 0;
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
    public View getView(int i, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        TextView tvLanguageTen = (TextView) convertView.findViewById(R.id.Ten);
        TextView tvLanguageCuahang = (TextView) convertView.findViewById(R.id.Cuahang);
        TextView tvLanguageGiathanh = (TextView) convertView.findViewById(R.id.Giathanh);
        ImageView imageView2 = (ImageView) convertView.findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) convertView.findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) convertView.findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) convertView.findViewById(R.id.imageView5);
        Button button8 = convertView.findViewById(R.id.button8);
        final LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.idlayout);
        tvLanguageTen.setText(listLanguage.get(i).getTen());
        tvLanguageCuahang.setText(listLanguage.get(i).getCuahang());
        tvLanguageGiathanh.setText(listLanguage.get(i).getGiatien());
        imageView2.setImageResource(listLanguage.get(i).getId());
        final Languageactivity language = listLanguage.get(i);
        Languageactivity languageactivity =listLanguage.get(i);
//
//        if (listLanguage != null && !listLanguage.isEmpty()) {
//            tvLanguageTen.setText(language.getTen());
//            tvLanguageCuahang.setText(language.getCuahang());
//            tvLanguageGiathanh.setText(language.getGiatien());
//            int idLanguage = language.getId();
//            switch (idLanguage) {
//                case 1:
//                    imageView2.setImageResource(R.drawable.donut_yellow_1);
//                    break;
//                case 2:
//                    imageView2.setImageResource(R.drawable.donut_yellow_1);
//                    break;
//                default:
//                    break;
//            }
//        }
//
//        imageView3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent in = new Intent(context, Activity2.class);
//                Bundle bundle = new Bundle();
//                bundle.putInt("id", languageactivity.getId());
//                bundle.putString("ten", languageactivity.getTen());
//                bundle.putString("giatien", languageactivity.getGiatien());
//
//                in.putExtras(bundle);
//                context.startActivity(in);
//            }
//        });
//        button8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//            view.setBackgroundColor(Color.RED);
//            }
//        });


        return convertView;
    }

//    public void filterList(ArrayList<Languageactivity> ar) {
//        arrayListLanguage = ar;
//        notifyDataSetChanged();
//    }
}
