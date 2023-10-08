package com.example.task1_mobile_intents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {

    private lateinit var firstButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        firstButton = view.findViewById(R.id.firstButton)


        firstButton.setOnClickListener {
            Toast.makeText(activity, "First Fragment", Toast.LENGTH_LONG).show()
        }

        return view
    }
}
