package com.example.task1_mobile_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnBiodata = findViewById<Button>(R.id.biodata)
        val btnFrag = findViewById<Button>(R.id.fragmen)

        btnBiodata.setOnClickListener {
            val intent = Intent(this, BiodataActivity::class.java)
            startActivity(intent)
        }

        btnFrag.setOnClickListener {
            val intent = Intent(this, FragActivity::class.java)
            startActivity(intent)
        }
    }
}