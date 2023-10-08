package com.example.task1_mobile_intents

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvNama = findViewById<TextView>(R.id.tvNama)
        val tvAlamat = findViewById<TextView>(R.id.tvAlamat)
        val tvNomorTelepon = findViewById<TextView>(R.id.tvNomorTelepon)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val btnBack = findViewById<Button>(R.id.back)
        val btnHome = findViewById<Button>(R.id.home)

        // Mengambil data yang dikirimkan dari LoginActivity
        val nama = intent.getStringExtra("nama")
        val alamat = intent.getStringExtra("alamat")
        val nomorTelepon = intent.getStringExtra("nomorTelepon")
        val email = intent.getStringExtra("email")

        // Menampilkan data di TextView atau elemen tampilan yang sesuai
        tvNama.text = "$nama"
        tvAlamat.text = "$alamat"
        tvNomorTelepon.text = "$nomorTelepon"
        tvEmail.text = "$email"

        btnBack.setOnClickListener {
            val intent = Intent(this, BiodataActivity::class.java)
            startActivity(intent)
        }

        btnHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

    }
}