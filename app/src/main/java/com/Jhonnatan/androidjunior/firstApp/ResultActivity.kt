package com.Jhonnatan.androidjunior.firstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.Jhonnatan.androidjunior.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val txtResult=findViewById<TextView>(R.id.txtResult)
        var name:String= intent.extras?.getString("NAME").orEmpty()
        txtResult.text="Bienvenido $name"


    }
}