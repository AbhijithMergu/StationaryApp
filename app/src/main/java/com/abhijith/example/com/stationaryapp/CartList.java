package com.abhijith.example.com.stationaryapp;

/**
 * Created by abhij on 2/12/2018.
 */

public class CartList {
    int image;
    String name,qty;
    float cost;

    public CartList(int image, String name, String qty, float cost) {
        this.image = image;
        this.name = name;
        this.qty = qty;
        this.cost = cost;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getQty() {
        return qty;
    }

    public float getCost() {
        return cost;
    }
}
