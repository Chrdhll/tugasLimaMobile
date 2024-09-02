package com.fadhil.tugaslimamobile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fadhil.tugaslimamobile.R.id.btnsuhu

class MainActivity : AppCompatActivity() {

    private lateinit var suhu : Button
    private lateinit var diskon : Button
    private lateinit var luasvolume : Button
    private lateinit var ganjilgenap : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        suhu = findViewById(R.id.btnsuhu)
        diskon= findViewById(R.id.btndiskon)
        luasvolume = findViewById(R.id.btnLuasVolume)
        ganjilgenap = findViewById(R.id.btnGanjilGenap)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        suhu.setOnClickListener(){
            val intent = Intent(this,konversiSuhu::class.java)
            startActivity(intent)
        }
        diskon.setOnClickListener(){
            val intent = Intent(this,Diskon::class.java)
            startActivity(intent)
        }
        luasvolume.setOnClickListener(){
            val intent = Intent(this,LuasVolume::class.java)
            startActivity(intent)
        }
        ganjilgenap.setOnClickListener(){
            val intent = Intent(this,BilanganGenapGanjil::class.java)
            startActivity(intent)
        }
    }
}