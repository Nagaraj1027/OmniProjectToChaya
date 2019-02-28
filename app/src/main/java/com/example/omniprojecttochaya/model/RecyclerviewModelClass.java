package com.example.omniprojecttochaya.model;

import java.io.Serializable;

/**
 * Created by npambhala on 9/29/2016.
 */
public class RecyclerviewModelClass implements Serializable {

    String name;
    String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
