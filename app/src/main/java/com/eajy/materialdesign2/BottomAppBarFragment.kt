package com.eajy.materialdesign2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class BottomAppBarFragment : Fragment() {

    // Declare fragment-specific variables for parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
// Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bottom_app_bar, container, false)

// Retrieve arguments here and assign them to your variables
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

        return view // Return the inflated view
    }

    companion object {
        // Create a companion object to provide a newInstance() method
        fun newInstance(param1: String, param2: String) =
            AboutFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}