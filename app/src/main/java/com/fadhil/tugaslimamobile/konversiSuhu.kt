package com.fadhil.tugaslimamobile

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class konversiSuhu : AppCompatActivity() {
    private lateinit var etsuhu : EditText
    private lateinit var btnfahrenheit : Button
    private lateinit var btnkelvin : Button
    private lateinit var btnreamur : Button
    private lateinit var txthasil : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_konversi_suhu)

        etsuhu = findViewById(R.id.etSuhu)
        btnfahrenheit = findViewById(R.id.btnFahrenheit)
        btnkelvin = findViewById(R.id.btnKelvin)
        btnreamur = findViewById(R.id.btnReamur)
        txthasil = findViewById(R.id.txthasil)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnfahrenheit.setOnClickListener(){
            val celcius = etsuhu.text.toString().toInt()

            val hasil = (1.8 * celcius) + 32

            txthasil.setText("Fahrenheit :" + hasil)
        }

        btnkelvin.setOnClickListener(){
            val celcius = etsuhu.text.toString().toInt()

            val hasil = celcius + 273.15

            txthasil.setText("Kelvin :" + hasil)
        }

        btnreamur.setOnClickListener(){
            val celcius = etsuhu.text.toString().toInt()

            val hasil = 0.8 * celcius

            txthasil.setText("Fahrenheit :" + hasil)
        }


    }
}