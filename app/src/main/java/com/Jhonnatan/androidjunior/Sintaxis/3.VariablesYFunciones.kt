package com.Jhonnatan.androidjunior.Sintaxis
fun Saludo(name:String){
    println("Hola bienvenidoo $name");
}

fun Calculadora(FirstNumber:Float,SecondNomber:Float):Float{
    return FirstNumber+SecondNomber;
}
fun main(){
    Saludo("Jhonnatan")
    println("Bienvenido a la calculadora :)")
    println(Calculadora(10.5f,20.4f))
    println(nameFunction(20))
}

fun nameFunction(first:Int):Int=first+12;