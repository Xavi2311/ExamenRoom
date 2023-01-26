package com.example.examenroom.database

import android.content.Context
import android.provider.ContactsContract
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

import androidx.room.migration.Migration
import com.example.examenroom.model.Mueble


@Database(
    version = 1,
    entities = [Mueble::class],
    exportSchema = true
)

abstract class MuebleDatabase : RoomDatabase() {
    abstract fun muebleDAO(): MuebleDAO

    companion object{
        @Volatile
        private var INSTANCE: MuebleDatabase?= null

        fun getDatabase(context: Context): MuebleDatabase{
            if (INSTANCE==null){
                synchronized(this){
                    INSTANCE=buildDataBase(context)
                }
            }
            return INSTANCE!!
        }

        private fun buildDataBase(context: Context): MuebleDatabase {

            return  Room.databaseBuilder(
                context.applicationContext,
                MuebleDatabase::class.java,
                "mueble_database"
                //Crear carpeta assets y hacer la base de datos
            ).createFromAsset("basedatosmuebles.db").build()
        }
    }
}