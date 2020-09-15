package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    String[] name = new String[] {"Harshad",
                                                 "Vrushik",
                                                 "Yash",
                                                 "Saumya",
                                                 "Parthiv",
                                                 "Mihir",
                                                 "Shaunak"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListviewiew();
    }
    public void setListviewiew(){
        listview = (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.name_list,name);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String)listview.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "Position : "+position+"Value :" + value , Toast.LENGTH_SHORT).show();
            }
        });
    }
}