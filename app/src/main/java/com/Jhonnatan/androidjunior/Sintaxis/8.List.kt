package com.Jhonnatan.androidjunior.Sintaxis

fun main() {
   //InmutableList();
    MutableList();

}

fun MutableList(){
    var weeDays:MutableList<String> = mutableListOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    //Agrega al final
    weeDays.add("JAJE");
    println(weeDays)

    weeDays.add(0,"Perro"); //--->Agrega en el indicie que le digas
    println(weeDays)

    //===VERIFICAR SI LA LISTA ESTA VACIA
    if(weeDays.isEmpty()){
        //No pinta nada
    }else{
        weeDays.forEach { x->println(x) }
    }
    //==VERIFICAR SI LA LISTA TIENE ELEMENTOS
    if(weeDays.isNotEmpty()){
        weeDays.forEach{f-> println(f);}
    }else{

    }


}






fun InmutableList(){
    //Creacion de lista solo para lectura
    //No se puede modificar ni cambiar porque se esta usando val
    val readOnly:List<String> = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    //Imprime toda la lista
    
    println(readOnly.toString());
    println(readOnly.get(0));
    println(readOnly[1]);
    println(readOnly.last());   //-->Devuelve el ultimo valor  de la lista

    println(readOnly.first())  //-->Devuelve el primer valor de la lista

    // ===FILTRAR=====
    //Filtrado a travez de un for y devuelve con contains las que coincidan
    val example=readOnly.filter { it.contains("e")}
    println(example)


    // ===RECORRER LISTAS ====
    var Acumulador:String=" ";
    readOnly.forEach { variable-> println(variable)}
    //FOR
    for (Read in readOnly){
        Acumulador+=Read+" ";
    }
    println("Los dias de la semana son $Acumulador")
}