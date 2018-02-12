package com.abhijith.example.com.stationaryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Product> productList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productList = new ArrayList<Product>();
        productList.add(new Product("Notebook",30,R.drawable.notebook));
        productList.add(new Product("Sharpener",5,R.drawable.notebook));
        productList.add(new Product("Stapler",60,R.drawable.notebook));
        productList.add(new Product("Pens",10,R.drawable.notebook));
        productList.add(new Product("Pencil",5,R.drawable.notebook));
        productList.add(new Product("Marker",30,R.drawable.notebook));

        ProductListAdapter adapter = new ProductListAdapter(this,R.layout.item_list_view,productList);
        listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}
