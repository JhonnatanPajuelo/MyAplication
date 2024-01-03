package com.Jhonnatan.androidjunior.Sintaxis

fun main(){
    var name:String?=null;   /// String nullable
                    //Hola
        //!! -> Estoy seguro que esto no va ser null
       // println(name!![3]);
        //Si la variable no es nulo  ?, devuelveleme la posicion 3
    //Pero si lo es ?: dame este texto en pantalla
        println(name?.get(3)?: "Es nulo carnal" ); //Operator ifelse
}