package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listview=findViewById(R.id.listView);
        ArrayList<String> items= new ArrayList<>();
        items.add("iPhone");
        items.add("BlackBerry");
        items.add("Android");
        items.add("Windows");
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.row,items);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(ListActivity.this,DetailActivity.class);
                startActivity(myIntent);

            }
        });

    }
}
