package com.Jhonnatan.androidjunior.imcCalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.Jhonnatan.androidjunior.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat
import kotlin.math.log
import kotlin.math.roundToInt

class ImcCalculatorActivity : AppCompatActivity() {
    private var isMaleSelected:Boolean=true
    private var isFemaleSelected:Boolean=false
    private var currentWeight:Int=89
    private var currentAge:Int=18
    private var currentHeight:Int=120
    private lateinit var tvHeight:TextView
    private lateinit var rsHeight:RangeSlider
    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView
    private lateinit var twWeight:TextView
    private lateinit var fabPlus:FloatingActionButton
    private lateinit var fabSubtract:FloatingActionButton
    private lateinit var tvAge:TextView
    private lateinit var fabPlusAge:FloatingActionButton
    private lateinit var fabSubtractAge:FloatingActionButton
    private lateinit var btnCalculate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)
        initComponent()
        initListeners()
        initUI()

    }

    private fun initComponent() {
        viewMale=findViewById(R.id.viewMale)
        viewFemale=findViewById(R.id.viewFemale)
        tvHeight=findViewById(R.id.tvHeight)
        rsHeight=findViewById(R.id.rsHeight)
        twWeight=findViewById(R.id.tvWeight)
        fabPlus=findViewById(R.id.fabPlus)
        fabSubtract=findViewById(R.id.fabSubtract)
        tvAge=findViewById(R.id.tvAge)
        fabPlusAge=findViewById(R.id.fabPlusAge)
        fabSubtractAge=findViewById(R.id.fabSubtractAge)
        btnCalculate=findViewById(R.id.btnCalcular)

    }
    private fun initListeners() {
        viewMale.setOnClickListener {
            changeGender()
            setGenderColor() }
        viewFemale.setOnClickListener {
            changeGender()
            setGenderColor()}

        rsHeight.addOnChangeListener { _, value, _ ->
            currentHeight=value.toInt()
            tvHeight.text=currentHeight.toString()+ " cm"
        }
        fabPlus.setOnClickListener {
            if(currentWeight<150){

                currentWeight+=1
                setWeight()
            }
        }
        fabSubtract.setOnClickListener {
            if(currentWeight>45){
                currentWeight-=1
                setWeight()
            }

        }
        fabSubtractAge.setOnClickListener {
            if(currentAge>1){
                currentAge-=1
                setAge()
            }

        }

        fabPlusAge.setOnClickListener {
            if(currentAge<90){
                currentAge+=1
                setAge()
            }

        }

        btnCalculate.setOnClickListener {

            val intent=Intent(this,ResultIMCActivity::class.java)

            val imc:Float=calculateIMC()
            intent.putExtra("IMC", imc)
            startActivity(intent)
        }

    }

    private fun calculateIMC():Float {
        val imc=(currentWeight/(currentHeight.toFloat()/100*currentHeight.toFloat()/100))
        var roundedIMC= String.format("%.2f",imc)

        return roundedIMC.toFloat()

    }

    private fun setWeight() {
        twWeight.text=currentWeight.toString()
    }
    private fun setAge(){


        tvAge.text=currentAge.toString()
    }
    private fun changeGender(){
        isMaleSelected=!isMaleSelected
        isFemaleSelected=!isFemaleSelected
    }
    private fun setGenderColor(){

        viewMale.setBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setBackgroundColor(getBackgroundColor(isFemaleSelected))

    }

    private fun getBackgroundColor(isSelectedComponent:Boolean):Int{

        val colorReference=if(isSelectedComponent){
            R.color.background_component_selected
        }else{
            R.color.background_component
        }

        return ContextCompat.getColor(this,colorReference)

    }

    private fun initUI() {
        setGenderColor()
        setWeight()
        setAge()
    }
}