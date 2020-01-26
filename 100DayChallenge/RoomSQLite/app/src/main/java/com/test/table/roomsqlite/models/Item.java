package com.test.table.roomsqlite.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "items")
public class Item {


    @PrimaryKey(autoGenerate = true)
    @NonNull  private Long id;
    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "description")
    public String description;

    @ColumnInfo(name = "quantity")
    public Long quantity;
//    private String name;
//    private String description;
//    private Long quantity;

    public Item(){

    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }


}
