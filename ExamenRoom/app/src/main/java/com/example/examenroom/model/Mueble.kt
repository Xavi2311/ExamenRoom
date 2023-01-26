package com.example.examenroom.model
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


    @Entity(tableName="Mueble")
    data class Mueble(
        @PrimaryKey(autoGenerate = true) var id: Int,
        @ColumnInfo(name="nombre")
        var nom: String,
        @ColumnInfo(name="precio")
        var preu: Int
        )



