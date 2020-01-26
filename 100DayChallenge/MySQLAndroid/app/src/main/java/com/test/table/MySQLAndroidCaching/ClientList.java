package com.test.table.MySQLAndroidCaching;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.test.table.MySQLAndroidCaching.pojo.Client;

import java.util.ArrayList;

public class ClientList {
    @SerializedName("client")
    @Expose
    private ArrayList<Client> client = null;

    public ArrayList<Client> getClient() {
        return client;
    }

    public void setClient(ArrayList<Client> client) {
        this.client = client;
    }
}
