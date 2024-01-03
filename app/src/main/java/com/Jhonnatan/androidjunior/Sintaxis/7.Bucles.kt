package com.Jhonnatan.androidjunior.Sintaxis

fun main() {
    var weekDays= arrayOf(5,"Tuesday","Wednesday","Thursday"
                            ,"Friday","Saturday","Sunday");
    //for (position in weekDays.indices)

    println(weekDays.indices);//rango del array
    var number=10;

    for (weekay in weekDays){ //
        println("El dia de hoy es $weekay")
    }

    //Crea una variable de tipo int que recorre el rango tipo int del array
    for (indice in weekDays.indices){
       println(weekDays.get(indice));
   }


    //Devuelve el indice y el valor  del array
    for ((indice,value) in weekDays.withIndex()){
        println("$indice y $value");
    }
}

