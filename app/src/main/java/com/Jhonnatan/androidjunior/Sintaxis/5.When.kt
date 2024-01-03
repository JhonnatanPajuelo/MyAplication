package com.Jhonnatan.androidjunior.Sintaxis

fun main(){
    genMonth(10)
}
fun genMonth(month:Int) {
    when(month){
        1-> println("Enero");
        2-> {   //Para poner mas de 1 linea usar las llaves
            println("Febrero");
            println("Es el inicio de la primera");
        };
        4,5,6-> println("Segundo Trimestre");  // Opciones multiples
        //Opciones Con rangos que va desde el 7-12
        in 7..12-> println("Opciones multiples");
        else -> println("No es un mes valido");
    }
}
