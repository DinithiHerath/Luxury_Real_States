package com.example.real_state_application_4984.Domain;

import java.io.Serializable;

public class ItemsDomain implements Serializable {

    private String title;
    private String address;
    private String description;
    private int bed;
    private int bath;
    private int price;
    private String pic;
    private boolean wifi;

    public ItemsDomain(String title, String address, String description, int bed, int bath, int price, String pic, boolean wifi) {
        this.title = title;
        this.address = address;
        this.description = description;
        this.bed = bed;
        this.bath = bath;
        this.price = price;
        this.pic = pic;
        this.wifi = wifi;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public char[] getBed() {
        return new char[0];
    }

    public boolean iswifi() {
        return false;
    }

    public char[] getBath() {
        return new char[0];
    }

    public int getDescription() {
        return 0;
    }
}