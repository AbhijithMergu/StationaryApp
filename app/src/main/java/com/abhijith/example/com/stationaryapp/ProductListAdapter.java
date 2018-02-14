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
 * Created by pavana on 12/02/18.
 */

public class ProductListAdapter extends ArrayAdapter<CartList> {
    Context ctxt;
    int resourceId;
    List<CartList> productList;

    public ProductListAdapter(@NonNull Context ctxt, int resourceId,@NonNull List<CartList> productList) {
        super(ctxt, resourceId,productList);
        this.ctxt = ctxt;
        this.resourceId = resourceId;
        this.productList = productList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(ctxt);
        View view = inflater.inflate(resourceId, null, false);
        final CartList product = productList.get(position);
        ImageView image = (ImageView) view.findViewById(R.id.item_image);
        TextView name = (TextView) view.findViewById(R.id.item_name);
        final TextView price = (TextView) view.findViewById(R.id.item_price);
        image.setImageDrawable(ctxt.getResources().getDrawable(product.getImage()));
        name.setText(product.getName());
        price.setText(String.valueOf(product.getCost()));
        final Button b = (Button) view.findViewById(R.id.add_button);
        if (product.getSelection() == true) {
            b.setText("ADDED");
            b.setEnabled(false);
        }
        else {
            b.setText("ADD");
            b.setEnabled(true);
        }
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                product.setSelection(true);
                b.setText("ADDED");
                b.setEnabled(false);
            }
        });
        return view;
    }


}
