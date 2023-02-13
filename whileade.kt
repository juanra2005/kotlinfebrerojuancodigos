//while
//Este ciclo hace uso de una condición en la que se valida la condición de parada, si esta condición es verdadera entonces se
//ingresa al ciclo repitiendose hasta que la condición sea Falsa y el ciclo termine.

// Haga un algoritmo que solicite un número y si este es negativo lo convierta a positivo y lo imprima, realice este proceso
//n cantidad de veces.

fun main(){
    var numero:int 
    var continuar ="si"
    while(continuar.uppercase() =="SI"){
        println("Ingrese un numero: ")
        numero=readline()!!.toint(
            if(numero < 0){
                numero=numero *-1
            }
            println("El numero positivo es $numero")
            println("¿Desea ingresar otro numero?(si/no): ")
            continuar=readline()!!
        )
    }
}

