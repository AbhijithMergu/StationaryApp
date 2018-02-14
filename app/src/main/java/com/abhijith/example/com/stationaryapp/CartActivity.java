package com.abhijith.example.com.stationaryapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhij on 2/12/2018.
 */

public class CartActivity extends Activity{
    List<CartList> cartList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        ListView cartListView=(ListView)findViewById(R.id.cartlistview);


        Bundle bundle = getIntent().getExtras();
        cartList = bundle.getParcelableArrayList("CartList");
        CartListAdapter adapter=new CartListAdapter(this,R.layout.mycart_list,cartList);
        cartListView.setAdapter(adapter);

    }
}
