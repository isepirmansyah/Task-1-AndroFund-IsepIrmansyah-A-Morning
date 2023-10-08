package com.example.task1_mobile_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class BiodataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        val btnSimpan = findViewById<Button>(R.id.btnSimpan)
        val etNama = findViewById<TextInputEditText>(R.id.etNama)
        val etAlamat = findViewById<TextInputEditText>(R.id.etAlamat)
        val etNomorTelepon = findViewById<TextInputEditText>(R.id.etNomorTelepon)
        val etEmail = findViewById<TextInputEditText>(R.id.etEmail)

        btnSimpan.setOnClickListener {
            val nama = etNama.text.toString()
            val alamat = etAlamat.text.toString()
            val nomorTelepon = etNomorTelepon.text.toString()
            val email = etEmail.text.toString()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("alamat", alamat)
            intent.putExtra("nomorTelepon", nomorTelepon)
            intent.putExtra("email", email)

            startActivity(intent)
        }
    }
}