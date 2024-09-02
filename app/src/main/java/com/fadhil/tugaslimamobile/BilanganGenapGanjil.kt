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

class BilanganGenapGanjil : AppCompatActivity() {

    lateinit var txtangka : EditText
    lateinit var btncheck : Button
    lateinit var txthasil : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bilangan_genap_ganjil)

        txtangka = findViewById(R.id.txtAngka)
        btncheck = findViewById(R.id.btnCheck)
        txthasil = findViewById(R.id.txtHasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btncheck.setOnClickListener{
            val angka =txtangka.text.toString().toInt()

            if(angka % 2 ==0){
                txthasil.setText("$angka adalah bilangan genap")
            }
            else{
                txthasil.setText("$angka adalah bilangan ganjil")
            }
        }
    }
}