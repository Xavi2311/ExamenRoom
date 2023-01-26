package com.example.examenroom.repositori

import android.content.Context
import com.example.examenroom.database.MuebleDatabase
import com.example.examenroom.model.Mueble
import kotlinx.coroutines.CoroutineScope

import kotlinx.coroutines.launch

import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO



class Repositori {
    companion object{
    var muebleDatabase: MuebleDatabase? = null
        var muebles: LiveData<List<Mueble>>? = null

    fun initializeDB(context: Context): MuebleDatabase{

        return MuebleDatabase.getDatabase(context)
    }

    fun insertMueble(context: Context, mueble: Mueble){
        muebleDatabase = initializeDB(context)

        CoroutineScope(Dispatchers.IO).launch {
            muebleDatabase!!.muebleDAO().addMueble(mueble)
        }
}

        fun selectMueble(context: Context): LiveData<List<Mueble>>? {
            muebleDatabase = initializeDB(context)

            CoroutineScope(Dispatchers.IO).launch {
                muebles=muebleDatabase!!.muebleDAO().getMuebles()

            }
            return muebles
        }
    }}