package com.example.activitya.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.activitya.R;
import com.example.activitya.adapter.AdapterActivity;
import com.example.activitya.model.Languageactivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CustomListView extends AppCompatActivity {
    private List<Languageactivity> listLanguage;
    private ListView listView;
    private Button button1;
    private Button button2;
    private Button button3;
//    ArrayList<Languageactivity> arrayListLanguage;
//    ArrayList<Languageactivity> arrayList;
//    AdapterActivity adapterActivity;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.idListView);
        button1 = findViewById(R.id.button8);
        button2 = findViewById(R.id.button9);
        button3 = findViewById(R.id.button10);
        listLanguage = new ArrayList<>();
//        listLanguage.add(new Languageactivity(1, "Tasty Donut", "Spicy tasty donut family", "$10.00"));
//        listLanguage.add(new Languageactivity(2, "Tasty Donut", "Spicy tasty donut family", "$10.00"));
        listLanguage.add(new Languageactivity(R.drawable.donut_yellow_1, "Tasty Donut", "Spicy tasty donut family", "$10.00"));
        listLanguage.add(new Languageactivity(R.drawable.pinkdonut, "Pink Donut", "Spicy tasty donut family", "$20.00"));
        listLanguage.add(new Languageactivity(R.drawable.floatingdonut, "Floating Donut", "Spicy tasty donut family", "$30.00"));
        listLanguage.add(new Languageactivity(R.drawable.redtastydonut, "Tasty Donut", "Spicy tasty donut family", "$40.00"));
        AdapterActivity adapter = new AdapterActivity(this, R.layout.item_customer, listLanguage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent in = new Intent(CustomListView.this, Activity2.class);
                Bundle bundle = new Bundle();
                bundle.putInt("id", listLanguage.get(i).getId());
                bundle.putString("ten",listLanguage.get(i).getTen() );
                bundle.putString("giatien", listLanguage.get(i).getGiatien());

                in.putExtras(bundle);
                startActivity(in);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundColor(Color.RED);
                button2.setBackgroundColor(Color.BLUE);
                button3.setBackgroundColor(Color.BLUE);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundColor(Color.RED);
                button1.setBackgroundColor(Color.BLUE);
                button3.setBackgroundColor(Color.BLUE);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundColor(Color.RED);
                button1.setBackgroundColor(Color.BLUE);
                button2.setBackgroundColor(Color.BLUE);
            }
        });

        EditText editText = findViewById(R.id.editTextTextPersonName2);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                String ten = editText.getText().toString();
                ArrayList<Languageactivity> ar = new ArrayList<>();
                for (int i = 0 ; i< listLanguage.size();i++)
                {
//                    if(listLanguage.get(i).getTen().equals(ten))
                    if(listLanguage.get(i).getTen().toLowerCase().contains(ten.toLowerCase()))
                    {
                        ar.add(listLanguage.get(i));
                        AdapterActivity adapter = new AdapterActivity(CustomListView.this,R.layout.item_customer,ar);
                        listView.setAdapter(adapter);
                    }
                }

            }
        });
//        EditText editText = findViewById(R.id.editTextTextPersonName2);
//        editText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                filter(s.toString());
//            }
//        });
//    }
//    private void filter(String text){
//        ArrayList<Languageactivity> ar = new ArrayList<>();
//        for(Languageactivity item : arrayListLanguage){
//            if(item.getTen().toLowerCase().contains(text.toLowerCase())){
//                ar.add(item);
//                arrayList.add(item);
//            }
//        }
//        adapterActivity.filterList(ar);
    }

}
