package com.abhijith.example.com.stationaryapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by abhij on 2/12/2018.
 */

public class CartListAdapter extends ArrayAdapter<CartList>{
    List<CartList> cartlist;
    Context ctxt;
    int resource;
    CartList cart;
    public CartListAdapter(@NonNull Context context, int resource, @NonNull List<CartList> cartlist) {
        super(context, resource, cartlist);
        ctxt=context;
        this.resource=resource;
        this.cartlist=cartlist;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(ctxt);
        View view=inflater.inflate(resource,null,false);
        ImageView imageView=view.findViewById(R.id.imageid);
        TextView textView=view.findViewById(R.id.textView);
        TextView textView1=view.findViewById(R.id.textview2);
        Button button=view.findViewById(R.id.button);
        final TextView textView2=view.findViewById(R.id.textview3);
        Button button1=view.findViewById(R.id.button2);
        cart=cartlist.get(position);
        imageView.setImageDrawable(ctxt.getResources().getDrawable(cart.getImage()));
        textView.setText(cart.getName());
        textView1.setText(String.valueOf(cart.getCost()));
        textView2.setText(String.valueOf(cart.getQty()));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cart.setQty(cart.getQty()+1);
                textView2.setText(String.valueOf(cart.getQty()));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cart.getQty()>0)
                {
                    cart.setQty(cart.getQty()-1);
                    textView2.setText(String.valueOf(cart.getQty()));
                }
            }
        });
       return view;
    }
}
