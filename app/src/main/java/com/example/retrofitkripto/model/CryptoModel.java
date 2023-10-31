package com.example.retrofitkripto.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("currency")
    String currency;
    @SerializedName("price")
    String price;

}
