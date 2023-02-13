//Uso de when como expresión
//También es posible utilizar when como una expresión en lugar de una sentencia, devolviendo un valor como resultado.
//En este ejemplo se asigna el resultado en una constante, nótese que no se usa ningún valor entre paréntesis ya que se están
//usando operadores relacionales.

//Haga un algoritmo que solicite el ingreso de un número e indique el dia correspondiente,
 //valide si el código no existe.

fun main(){
var dayNum=5
when (dayNum) {
1 -> println("Lunes")
2 -> println("Martes")
3 -> println("Miércoles")
4 -> println("Jueves")
5 -> println("Viernes")
6 -> println("Sábado")
7 -> println("Domingo")
else -> println("Día inválido")
}
}
