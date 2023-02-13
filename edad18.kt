//CONDICIONALES SIMPLES
//Diseñe un Algoritmo que solicite la edad de una persona, si la edad es menor a 18 indique que
// la persona es menor de edad
fun main(){
    printl("Ingrese la edad: ")
    val edad=readline()!!.toint()
    if(edad<18){
        println("La persona es menor de edad")
    }
    println("La edad es: $edad") 
}

