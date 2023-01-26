package com.example.examenroom.viewmodels

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.examenroom.model.Mueble
import com.example.examenroom.repositori.Repositori

class SharedViewModel: ViewModel() {

    var muebles: LiveData<List<Mueble>>? = null

    fun newMueble(context: Context, nom:String, preu:Int){

        var muebleVM=Mueble(0,nom,preu)

        Repositori.insertMueble(context,muebleVM)

    }

    fun obtenirMuebles(context:Context,marca: String ): LiveData<List<Mueble>>?{
        muebles = Repositori.selectMueble(context)
        return muebles
    }
}