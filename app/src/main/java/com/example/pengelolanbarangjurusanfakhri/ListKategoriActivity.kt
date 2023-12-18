package com.example.pengelolanbarangjurusanfakhri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView

class ListKategoriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        // Set a click listener for the Toolbar
        toolbar.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val btnkategori: CardView = findViewById(R.id.categoryCard)
        btnkategori.setOnClickListener {

            val intent = Intent(this, DetailBarangActivity::class.java)
            startActivity(intent)
        }

        val btnkategori1: CardView = findViewById(R.id.categoryCard2)
        btnkategori1.setOnClickListener {

            val intent = Intent(this, DetailBarangActivity1::class.java)
            startActivity(intent)
        }

        val btnkategori2: CardView = findViewById(R.id.categoryCard3)
        btnkategori2.setOnClickListener {

            val intent = Intent(this, DetailBarangActivity2::class.java)
            startActivity(intent)
        }
    }


}