 //CONDICIONALES DOBLES
 //estas estructuras permiten no solo ejecutar una determinada acción
//cuando se cumple determinada condición, sino que en caso de que la condición no se cumpla, brinda otro camino para realizar
//acciones diferentes
 
 //Algoritmo que calcule solicite el nombre y la materia de un estudiante, así como 3 notas parciales y con esto calcule el
//promedio de notas, valide que si el estudiante saca un promedio mayor o igual a 3.5 entonces indique que el estudiante ganó
//la materia, de lo contrario indique que la perdió, el mensaje deberá mencionar el nombre y la materia del estudiante

fun main(){
    print("Ingrese su nombre: ")
    val nombre =readline().toString()
    println("Ingrese el nombre de la materia: ")
    val materia=readline().toString()
        println("Ingrese la nota 1: ")
            val nota1=readline().tofloat()
                    println("Ingrese la nota 2: ")
            val nota2=readline().tofloat()
                    println("Ingrese la nota 3: ")
            val nota3=readline().tofloat()
            val prom =(nota1+nota2+nota3)/3
            print("El promedio de las notas es $prom")
            if(prom>=3.5){
                print("El estudiante $nombre GANO la materia $materia")

            }else{
                println("El estudiante $nombre PERDIO la materia $materia")
            }



}