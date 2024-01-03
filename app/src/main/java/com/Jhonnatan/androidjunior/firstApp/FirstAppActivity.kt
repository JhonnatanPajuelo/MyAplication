package com.Jhonnatan.androidjunior.firstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.Jhonnatan.androidjunior.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        //Asignarle un valor de las vistas a las activities
        val botonstart=findViewById<AppCompatButton>(R.id.btnStart)
        val EditText=findViewById<AppCompatEditText>(R.id.etName)

        //Cuando se pulsa el boton

        botonstart.setOnClickListener {
        val name=EditText.text.toString();

            if(name.isNotEmpty()){
                var intent= Intent(this,ResultActivity::class.java)
                intent.putExtra("NAME",name)
                startActivity(intent)

            }else{
                Log.i("Acceso Restringido", "No se registraron datos" )
            }

        }
    }
}