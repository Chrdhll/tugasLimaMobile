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

class Diskon : AppCompatActivity() {

    lateinit var totalb : EditText
    lateinit var hargatotal : TextView
    lateinit var btninput : Button
    lateinit var txtdiskon : TextView



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_diskon)

        totalb = findViewById(R.id.TotalB)
        btninput = findViewById(R.id.btnInput)
        hargatotal = findViewById(R.id.HargaTotal)
        txtdiskon = findViewById(R.id.txtdiskon)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btninput.setOnClickListener{
            val harga = totalb.text.toString().toInt()

            if (harga < 100000) {
                val hasil = harga*1

                txtdiskon.setText("Anda tidak mendapat diskon")
                hargatotal.setText("Total yang harus anda bayar :" +hasil)
            }
            else if (harga >= 100000 && harga < 500000) {
                val hasil = harga-(harga*0.1)

                txtdiskon.setText("Diskon 10%")
                hargatotal.setText("Total yang harus anda bayar :" +hasil)
            }
            else if (harga >= 500000 && harga < 1000000) {
                val hasil = harga-(harga*0.2)

                txtdiskon.setText("Diskon 20%")
                hargatotal.setText("Total yang harus anda bayar :" +hasil)
            }
            else if (harga > 1000000) {
                val hasil = harga-(harga*0.3)

                txtdiskon.setText("Diskon 30%")
                hargatotal.setText("Total yang harus anda bayar :" +hasil)
            }
            else{
                txtdiskon.setText("Masukkan angka yang valid")
                hargatotal.setText(null)
            }

        }

    }
}