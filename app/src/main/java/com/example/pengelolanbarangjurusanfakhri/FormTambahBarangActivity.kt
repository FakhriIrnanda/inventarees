package com.example.pengelolanbarangjurusanfakhri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class FormTambahBarangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_tambah_barang)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        // Set a click listener for the Toolbar
        toolbar.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val btntambah: Button = findViewById(R.id.btnTambah)
        btntambah.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        
    }
}