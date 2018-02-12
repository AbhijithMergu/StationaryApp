package com.abhijith.example.com.stationaryapp;

/**
 * Created by pavana on 12/02/18.
 */

public class Product {
    String itemName;
    float price;
    int resourceId;
    public Product(String itemName, float price, int resourceId)
    {
        this.itemName = itemName;
        this.price = price;
        this.resourceId = resourceId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}

