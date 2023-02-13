//do -while
//do-while es una estructura de control de repetición en Kotlin que se utiliza para ejecutar un bloque de código al menos una vez y
//luego repetir el bloque mientras se cumpla una determinada condición. En do-while , el bloque de código se ejecuta antes de
//evaluar la condición.

//Haga un algoritmo que solicite el nombre de n cantidad de personas e imprima un saludo, el usuario ingresará la
//cantidad de personas a validar.

fun main(){
    println("Ingrese la cantidad de personas a saludar: ")
    val cantidadPersonas=readline()!!.toint()
    var contador=1
    do{
        println("Ingrese el nombre de la persona $contador: ")
        val nombre=readline()!!
        println("Hola $nombre, Bienvenido!")
        contador++

    }while(contador <= cantidadPersonas)
}