package com.example.task1_mobile_intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment


class FragActivity : AppCompatActivity() {
    private lateinit var firstFragment: Button
    private lateinit var secondFragment: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frag)


        firstFragment = findViewById(R.id.firstFragment)
        secondFragment = findViewById(R.id.secondFragment)

        firstFragment.setOnClickListener {
            loadFragment(FirstFragment())
        }

        secondFragment.setOnClickListener {
            loadFragment(SecondFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}
