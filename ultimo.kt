//For
//El ciclo for es una estructura de control de bucle en Kotlin que se utiliza para iterar una secuencia de elementos. Por ejemplo,
//puedes usar un ciclo for para recorrer un rango de números, recorrer cada uno de los elementos de una lista, o ejecutar una
//función para cada elemento de una lista.

//Haga un algoritmo que permita calcular el promedio de n estudiantes, el sistema debe imprimir:
// Cantidad de estudiantes procesados
//promedio total de los promedios

fun main() {
var cantidadEstudiantes: Int
var sumaPromedios = 0.0
println("Ingrese la cantidad de estudiantes: ")
cantidadEstudiantes = readLine()!!.toInt()
for (i in 1..cantidadEstudiantes) {
println("Ingrese el promedio del estudiante $i: ")
var promedio = readLine()!!.toDouble()
sumaPromedios += promedio
}
var promedioTotal = sumaPromedios / cantidadEstudiantes
println("Cantidad de estudiantes procesados: $cantidadEstudiantes")
println("Promedio total de los promedios: $promedioTotal")
}
