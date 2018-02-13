package com.abhijith.example.com.stationaryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Product> productList;
    ListView listView;
    List<CartList> cart=new ArrayList<>();
    Product p;
Intent cartIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productList = new ArrayList<Product>();
        productList.add(new Product("Notebook", 30, R.drawable.notebook));
        productList.add(new Product("Sharpener", 5, R.drawable.sharpener));
        productList.add(new Product("Stapler", 60, R.drawable.stapler));
        productList.add(new Product("Pens", 10, R.drawable.pens));
        productList.add(new Product("Pencil", 5, R.drawable.pencil));
        productList.add(new Product("Marker", 30, R.drawable.marker));
        productList.add(new Product("Record Book",35, R.drawable.record));
        productList.add(new Product("Fevi Kwik",5,R.drawable.fevikwik));
        productList.add(new Product("Stationary Box",30,R.drawable.stationary_box));
        productList.add(new Product("Soft Drinks",20,R.drawable.softdrinks));
        productList.add(new Product("Gone-Mad Chocostick",5,R.drawable.gonemad));
        productList.add(new Product("Five Star",10,R.drawable.fivestar));

        ProductListAdapter adapter = new ProductListAdapter(this, R.layout.item_list_view, productList);
        listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        
    }

}

