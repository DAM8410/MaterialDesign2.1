package com.eajy.materialdesign2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BottomNavigationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
// Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bottom_navigation, container, false)

        return view // Return the inflated view
    }

    companion object {
        // Create a companion object to provide a newInstance() method
        fun newInstance(param1: String, param2: String) =
            AboutFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}