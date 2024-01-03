package com.Jhonnatan.androidjunior.Sintaxis
//&& y ||
fun main(){
    Condicionales("Pedro");
    IfAnilados();
    EjercicioCondicional();
}
fun IfAnilados(){
    var animal:String="Jhonnatan"
    if (animal=="Perro"){
        println("Hola perrito wao wao")
    }else if(animal=="Gato"){
        println("Hola gatito miau miau")
    }else
        println("Oye $animal ronca kbron tu no eres ni perro ni gato q chu eres")
}
fun Condicionales(name:String){
    if(name=="Pedro"){
        println("Hola $name");
    }else{
        println("Oye carnal tu no eres $name");
    }
}

fun EjercicioCondicional(){
    var edad:Int=18

    if(edad>0 && edad<18){
        println("Oye mi compa anda estudia oe rechucha")
    }else if(edad<20){
        println("Mi compa toma pero con moderacion")
    }else{
        println("Oe vegetal anda chupa wasaberto")
    }
}