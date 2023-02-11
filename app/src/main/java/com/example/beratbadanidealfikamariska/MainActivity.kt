package com.example.beratbadanidealfikamariska

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nama : EditText
    private lateinit var tb : EditText
    private lateinit var jkLakilaki : RadioButton
    private lateinit var jkPerempuan : RadioButton
    private lateinit var bb : TextView
    private lateinit var hitung : Button
    private var tBadan : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nama = findViewById(R.id.txtNama)
        tb = findViewById(R.id.txtTinggiBadan)
        jkLakilaki = findViewById(R.id.rbLakilaki)
        jkPerempuan = findViewById(R.id.rbPerempuan)
        bb = findViewById(R.id.txtHasil)
        hitung = findViewById(R.id.btnHitung)

        hitung.setOnClickListener {
            var tinggi = tb.text.toString().toInt()

            if(jkLakilaki.isChecked){
                tBadan = (tinggi-100)-((tinggi-100)* 10/100)
                bb.setText(tBadan.toString()+"kg")
            } else{
               tBadan = (tinggi-100)-((tinggi-100)* 15/100)
                bb.setText(tBadan.toString()+"kg")
            }
        }
    }

}