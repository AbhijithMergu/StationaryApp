package com.abhijith.example.com.stationaryapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

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
        cartList = new ArrayList<>();
        ListView cartListView=(ListView)findViewById(R.id.cartlistview);
        cartList.add(new CartList(R.drawable.download,"pen","1",23));
        cartList.add(new CartList(R.drawable.download,"book","2",23));
        cartList.add(new CartList(R.drawable.download,"pen","3",23));
        cartList.add(new CartList(R.drawable.download,"pen","4",23));
        cartList.add(new CartList(R.drawable.download,"pen","1",23));
        cartList.add(new CartList(R.drawable.download,"pen","4",23));
        cartList.add(new CartList(R.drawable.download,"pen","4",23));
        cartList.add(new CartList(R.drawable.download,"pen","4",23));
        cartList.add(new CartList(R.drawable.download,"pen","4",23));
        CartListAdapter adapter=new CartListAdapter(this,R.layout.mycart_list,cartList);
        cartListView.setAdapter(adapter);
    }


}
