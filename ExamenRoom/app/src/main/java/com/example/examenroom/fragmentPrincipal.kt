package com.example.examenroom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.examenroom.databinding.FragmentPrincipalBinding

private lateinit var  binding: FragmentPrincipalBinding

class fragmentPrincipal : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_principal, container, false
        )

        return binding.root
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