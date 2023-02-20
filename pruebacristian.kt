
//Crear un arreglo de valores predefinidos:
val numeros = arrayOf(1, 2, 3, 4, 5)

//Crear un arreglo vacío con una longitud determinada:
val nombres = arrayOfNulls<String>(5)



val numeros = arrayOf(1, 2, 3, 4, 5)

// Acceder al primer elemento
val primerNumero = numeros[0] // primerNumero = 1

// Acceder al tercer elemento
val tercerNumero = numeros[2] // tercerNumero = 3

// Acceder al último elemento
val ultimoNumero = numeros[numeros.size - 1] // ultimoNumero = 5

for (numero in numeros) {
    println(numero)
}


var numeros = arrayOf(1, 2, 3, 4, 5)

// Modificar el segundo elemento
numeros[1] = 10

// Imprimir el arreglo modificado
println(numeros.contentToString()) // [1, 10, 3, 4, 5]

//se pueden recorrer arreglos
val arreglo = arrayOf(1, 2, 3, 4, 5)

arreglo.forEach { elemento ->
    println(elemento)
}

//para crear listas
val lista1 = listOf(1, 2, 3, 4, 5)
val lista2 = listOf("hola", "mundo")
val lista3 = listOf(true, false, true)


//para recorrer listas
val numeros = listOf(1, 2, 3, 4, 5)
val tercerNumero = numeros[2] // El tercer número es el que tiene índice 2

//Modificar lista
var numeros = mutableListOf(1, 2, 3, 4, 5)
numeros[2] = 10 // Se modifica el tercer elemento de la lista

//Recorrer una lista
val numeros = listOf(1, 2, 3, 4, 5)
for (i in numeros.indices) {
    println(numeros[i])
}

fun main() {
    // Crear un conjunto inmutable de colores
    val colores = setOf("Rojo", "Verde", "Azul")

    // Imprimir los elementos del conjunto
    println("Los colores son: $colores")
}

fun main() {
    // Crear un conjunto inmutable de colores
    val colores = setOf("Rojo", "Verde", "Azul")

    // Recorrer los elementos del conjunto utilizando la función forEach()
    colores.forEach {
        println(it)
    }
}

fun main() {
    // Crear un conjunto inmutable de números
    val numeros = setOf(1, 2, 3, 4, 5)

    // Recorrer el conjunto utilizando un bucle for
    for (numero in numeros) {
        println(numero)
    }
}

//creacion de mapas
val miMapaMutable = mutableMapOf<String, Int>()
miMapaMutable["a"] = 1
miMapaMutable["b"] = 2
miMapaMutable["c"] = 3

//ACCEDER A LOS ELEMENTOS DEL MAPA
val miMapa = mapOf("a" to 1, "b" to 2, "c" to 3)
val valorB = miMapa["b"] // devuelve 2


val miMapaMutable = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
miMapaMutable["b"] = 4


val miMapa = mapOf("a" to 1, "b" to 2, "c" to 3)

for ((clave, valor) in miMapa) {
    println("La clave es $clave y el valor es $valor")
}

//PARES
val miPar: Pair<String, Int> = Pair("Hola", 42)


//ACCEDER A LOS ELEMENTOS DE UN PAR
val miPar: Pair<String, Int> = Pair("Hola", 42)
val primerElemento = miPar.first
val segundoElemento = miPar.second
println(primerElemento) // imprime "Hola"
println(segundoElemento) // imprime "42"

//MODIFICACION PAR
val miPar: Pair<String, Int> = Pair("Hola", 42)
val nuevoPar = miPar.copy(first = "Nuevo valor", second = 100)
println(nuevoPar) // imprime "(Nuevo valor, 100)"

//Recorrer par
val miPar: Pair<String, Int> = Pair("Hola", 42)
val primerElemento = miPar.first // primerElemento tiene el valor "Hola"

val miPar = 42 to "Hola"


fun main() {
    val numeros = arrayOf(10, 7, 21, 4, 15, 8, 12, 3)
    var maximo = numeros[0]
    
    for (numero in numeros) {
        if (numero > maximo) {
            maximo = numero
        }
    }
    
    println("El número más grande es $maximo")
}

fun main() {
    val numeros = listOf(10, 7, 21, 4, 15, 8, 12, 3)
    var suma = 0
    
    for (numero in numeros) {
        suma += numero
    }
    
    println("La suma de los números es $suma")
}

fun main() {
    val numeros = listOf(10, 7, 21, 4, 15, 8, 12, 3, 10, 7, 15, 3)
    val numerosUnicos = numeros.toSet()
    
    println("La lista original es: $numeros")
    println("La lista sin duplicados es: $numerosUnicos")
}


fun main() {
    val nombresEdades = listOf(
        "Juan" to 25,
        "María" to 30,
        "Luis" to 45,
        "Ana" to 20,
        "Pedro" to 35
    )
    val mapaNombresEdades = nombresEdades.toMap()
    
    println("El mapa de nombres y edades es: $mapaNombresEdades")
}
