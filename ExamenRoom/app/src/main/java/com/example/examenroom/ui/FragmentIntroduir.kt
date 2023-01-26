package com.example.examenroom.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.examenroom.R
import com.example.examenroom.databinding.FragmentIntroduirBinding
import com.example.examenroom.viewmodels.SharedViewModel


class FragmentIntroduir : Fragment() {
    private lateinit var  binding: FragmentIntroduirBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var muebleViewModel = ViewModelProvider(this).get(SharedViewModel::class.java)
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_introduir, container, false
        )

        binding.botoAfegir.setOnClickListener{
            val nom = binding.textNom.text.toString()
            val preu = binding.textPreu.text.toString().toInt()
            Toast.makeText(requireContext(),"Añadido", Toast.LENGTH_LONG)
            muebleViewModel.newMueble(requireContext(),nom,preu)
        }

        return binding.root
    }

    companion object {


        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentIntroduir().apply {
                arguments = Bundle().apply {

                }
            }
    }
}