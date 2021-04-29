package com.example.maket.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.maket.Entity.Buy;

import java.util.List;

@Dao
public interface DaoBuy {

    @Query("Select * from buy_db")

    List<Buy> BUY_LIST();

    @Insert
    void insertorder(Buy buy);



}
