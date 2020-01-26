package com.test.table.roomsqlite.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;
import com.test.table.roomsqlite.models.Item;

import android.arch.persistence.room.Query;
import java.util.List;

@Dao
public interface ItemDAO {
    @Insert
    public void insert(Item... items);
    @Update
    public void update(Item... items);
    @Delete
    public void delete(Item item);
    @Query("SELECT * FROM items")
    public List<Item> getItems();
    @Query("SELECT * FROM items WHERE id = :id")
    public Item getItemById(Long id);
}
