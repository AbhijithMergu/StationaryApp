package com.abhijith.example.com.stationaryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id==R.id.menu_cart_button)
        {
            Toast.makeText(getApplicationContext(),"Main action is selected",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,CartActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

