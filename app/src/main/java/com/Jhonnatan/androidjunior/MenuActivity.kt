package com.Jhonnatan.androidjunior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.Jhonnatan.androidjunior.TodoApp.TodoActivity
import com.Jhonnatan.androidjunior.firstApp.FirstAppActivity
import com.Jhonnatan.androidjunior.imcCalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp=findViewById<Button>(R.id.btnSaludApp)
        val btnIMC=findViewById<Button>(R.id.btnIMCApp)
        val btnTodoApp=findViewById<Button>(R.id.BtnListApp)
        btnSaludApp.setOnClickListener { navigateFromSaludApp() }
        btnIMC.setOnClickListener { navigateToIMCapp() }
        btnTodoApp.setOnClickListener { navigatetoTodoApp() }

    }

    private fun navigatetoTodoApp() {
        val intent=Intent(this,TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToIMCapp() {
       val intent= Intent(this,ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateFromSaludApp(){
        val intent=Intent(this,FirstAppActivity::class.java)
        startActivity(intent)
    }
}