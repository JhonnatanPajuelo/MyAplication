package com.Jhonnatan.androidjunior.imcCalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.Jhonnatan.androidjunior.R

class ResultIMCActivity : AppCompatActivity() {
    private lateinit var tvSugerencia: TextView
    private lateinit var tvIMC: TextView
    private lateinit var btnVuelveCalcular:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)
        initComponent()
        ReturnIMCySegurencia()
        initListeners()
    }

    private fun initListeners() {
        btnVuelveCalcular.setOnClickListener { onBackPressed() }
    }

    private fun ReturnIMCySegurencia() {
       var imc:Float?=intent.extras?.getFloat("IMC")
       if(imc!=null){

           tvIMC.text="Tu imc es $imc"

           when(imc){
               in 0.00 ..18.49-> {

                   tvSugerencia.text="Tiene peso Insuficiente"

                    tvSugerencia.setTextColor(ContextCompat.getColor(this,R.color.purple_500))
               };
               in 18.50f ..24.99f-> tvSugerencia.text="Tienes peso Normal";
               in 25.00f ..29.99f-> tvSugerencia.text="Tiene sobrepeso";
               in 30.00f ..34.99f-> tvSugerencia.text="Tienes obesidad grado 1";
               in 35.00f ..39.99f-> tvSugerencia.text="Tienes obesidad grado 2";
               else->tvSugerencia.text="Tienes obesidad grado 3"
           }

       }else
           tvIMC.text="Completa los campos solicitados"


    }

    private fun initComponent() {
        tvSugerencia=findViewById(R.id.tvSugerencia)
        tvIMC=findViewById(R.id.tvIMC)
        btnVuelveCalcular=findViewById(R.id.btnVuelveCalcular)

    }
}