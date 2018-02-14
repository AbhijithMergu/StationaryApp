package com.abhijith.example.com.stationaryapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by abhij on 2/12/2018.
 */

public class CartList implements Parcelable{
    int image;
    String name;
    int qty;
    float cost;
    boolean selected;

    public CartList(String itemName, float price, int resourceId)
    {
        this.name = itemName;
        this.cost = price;
        this.image = resourceId;
        this.selected=false;
        this.qty=1;
    }

    public CartList(int image, String name, int qty, float cost) {
        this.image = image;
        this.name = name;
        this.qty = qty;
        this.cost = cost;
        this.selected=false;
    }

    public void setSelection(boolean flag) { selected = flag; }
    public boolean getSelection() { return selected; }
    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public float getCost() {
        return cost;
    }

    public void writeToParcel(Parcel dest, int flags){

        dest.writeInt(image);
        dest.writeString(name);
        dest.writeInt(qty);
        dest.writeFloat(cost);
    }

    //constructor used for parcel
    public CartList(Parcel parcel){
        //read and set saved values from parcel
        image = parcel.readInt();
        name = parcel.readString();
        qty = parcel.readInt();
        cost = parcel.readFloat();
    }

    //creator - used when un-parceling our parcle (creating the object)
    public static final Parcelable.Creator<CartList> CREATOR = new Parcelable.Creator<CartList>(){

        @Override
        public CartList createFromParcel(Parcel parcel) {
            return new CartList(parcel);
        }

        @Override
        public CartList[] newArray(int size) {
            return new CartList[0];
        }
    };

    public int describeContents() {
        return hashCode();
    }
}
