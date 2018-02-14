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
    List<CartList> productList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productList = new ArrayList<CartList>();
        productList.add(new CartList("Notebook", 30, R.drawable.notebook));
        productList.add(new CartList("Sharpener", 5, R.drawable.sharpener));
        productList.add(new CartList("Stapler", 60, R.drawable.stapler));
        productList.add(new CartList("Pens", 10, R.drawable.pens));
        productList.add(new CartList("Pencil", 5, R.drawable.pencil));
        productList.add(new CartList("Marker", 30, R.drawable.marker));
        productList.add(new CartList("Record Book",35, R.drawable.record));
        productList.add(new CartList("Fevi Kwik",5,R.drawable.fevikwik));
        productList.add(new CartList("Stationary Box",30,R.drawable.stationary_box));
        productList.add(new CartList("Soft Drinks",20,R.drawable.softdrinks));
        productList.add(new CartList("Gone-Mad Chocostick",5,R.drawable.gonemad));
        productList.add(new CartList("Five Star",10,R.drawable.fivestar));

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
            ArrayList <CartList> arrayList = new ArrayList<CartList>();
            for(int i = 0; i<productList.size();i++)
            {
                CartList product = productList.get(i);
                if(product.getSelection())
                {
                    arrayList.add(product);
                }
            }
            Intent intent = new Intent(MainActivity.this,CartActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("CartList",arrayList);
            intent.putExtras(bundle);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

