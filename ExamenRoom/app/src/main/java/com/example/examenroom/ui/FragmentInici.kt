package com.example.examenroom.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.examenroom.R
import com.example.examenroom.databinding.FragmentIniciBinding
import com.example.examenroom.databinding.FragmentIntroduirBinding


class FragmentInici : Fragment() {
    private lateinit var  binding: FragmentIniciBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_inici, container, false
        )
        binding.button3.setOnClickListener{
            Toast.makeText(requireContext(),"Añadido", Toast.LENGTH_LONG)
        }
        return binding.root
    }

    companion object {


        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentInici().apply {
                arguments = Bundle().apply {

                }
            }
    }
}