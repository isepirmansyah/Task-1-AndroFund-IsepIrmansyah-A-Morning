package com.example.task1_mobile_intents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {

    private lateinit var secondButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        secondButton = view.findViewById(R.id.secondButton)

        secondButton.setOnClickListener {
            Toast.makeText(activity, "Second Fragment", Toast.LENGTH_LONG).show()
        }

        return view
    }
}
