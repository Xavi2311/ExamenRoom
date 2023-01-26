package com.example.examenroom.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.examenroom.R
import com.example.examenroom.databinding.FragmentPrincipalBinding

class fragmentPrincipal : Fragment() {

    private lateinit var  binding: FragmentPrincipalBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return null
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragmentPrincipal().apply {
                arguments = Bundle().apply {

                }
            }
    }
}