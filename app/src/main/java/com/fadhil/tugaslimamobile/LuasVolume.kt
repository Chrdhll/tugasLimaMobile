package com.fadhil.tugaslimamobile

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LuasVolume : AppCompatActivity() {

     lateinit var txtpanjang : EditText
     lateinit var txtlebar : EditText
     lateinit var txttinggi : EditText
     lateinit var btnluas : Button
     lateinit var btnvolume : Button
     lateinit var txthasil : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_luas_volume)

        txtpanjang = findViewById(R.id.txtPanjang)
        txtlebar = findViewById(R.id.txtLebar)
        txttinggi = findViewById(R.id.txtTinggi)
        btnluas = findViewById(R.id.btnLuas)
        btnvolume = findViewById(R.id.btnVolume)
        txthasil = findViewById(R.id.txthasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnluas.setOnClickListener(){
            val panjang = txtpanjang.text.toString().toInt()
            val lebar = txtlebar.text.toString().toInt()
            val tinggi = txttinggi.text.toString().toInt()

            val hasil = 2*((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi))

            txthasil.setText("Luas permukaan adalah : " + hasil)
        }

        btnvolume.setOnClickListener(){
            val panjang = txtpanjang.text.toString().toInt()
            val lebar = txtlebar.text.toString().toInt()
            val tinggi = txttinggi.text.toString().toInt()

            val hasil = panjang*lebar*tinggi

            txthasil.setText("Volume permukaan adalah : " + hasil)
        }
    }
}