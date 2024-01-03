package com.Jhonnatan.androidjunior.exercises

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is $"+ ticketPrice(child,isMonday))
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {

    var price:Int;

    if(age<=12){
       price=15;
   }else if(age<=60){
       if(!isMonday){
           price=30;
       }else price=25;
    }else if(age<=100)
        price=20;
    else price=-1;

    return price;
}