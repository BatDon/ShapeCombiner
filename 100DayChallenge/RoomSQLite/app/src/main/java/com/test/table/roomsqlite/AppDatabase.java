package com.test.table.roomsqlite;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.test.table.roomsqlite.dao.ItemDAO;
import com.test.table.roomsqlite.models.Item;

@Database(entities = {Item.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ItemDAO getItemDAO();
}