package com.Jhonnatan.androidjunior.Sintaxis

//Un array es una variable que nos permite almacenar un conjunto de variables

fun main() {
    //Creacion de un array asignando valores

    var weekDays= arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday");
    //Con esto solo estaria imprimiendo la direccion se memoria que apunto
    println(weekDays);
    //Retorna el valor en la posicion 0
    println(weekDays.get(0));
    //Otra forma que me retorne el valor en la posicion 0
    println(weekDays[1]);
    //Me retorna el tamaño de mi array
    println(weekDays.size);
    //Me retorna el ultimo valor
    println(weekDays.get(weekDays.size-1))
    println(weekDays[weekDays.size-1])


}

