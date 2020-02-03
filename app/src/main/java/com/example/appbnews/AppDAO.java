package com.example.appbnews;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public abstract class AppDAO {

    @Insert
    public abstract void insertarEquipo(Equipo equipo);

    @Query("SELECT * FROM Equipo")
    public abstract LiveData<List<Equipo>> obtenerEquipo();
}