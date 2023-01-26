package com.example.examenroom.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.examenroom.model.Mueble

@Dao
interface MuebleDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addMueble(mueble: Mueble)

    @Query("SELECT * FROM Mueble")
    fun getMuebles(): LiveData<List<Mueble>>
}