package com.example.activitya.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.activitya.R;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ImageView imgView = findViewById(R.id.imageView);
        TextView tvName = findViewById(R.id.textView);
        TextView tvPrice = findViewById(R.id.textView5);

        Intent in = getIntent();
        int idImage = in.getIntExtra("id",0);
        String nameDonut = in.getStringExtra("ten");
        String priceDonut = in.getStringExtra("giatien");

        imgView.setImageResource(idImage);
        tvName.setText(nameDonut);
        tvPrice.setText(priceDonut);
    }
}