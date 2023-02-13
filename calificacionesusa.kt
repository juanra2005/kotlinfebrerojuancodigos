//Condicionales múltiples (Anidados)
//Cuando se trabaja con condicionales, es muy común encontrar casos en los que después de tomar una decisión, se requiera
//seguir un posible camino donde se tengan que implementar nuevas condiciones, para esto se aplican las estructuras
//condicionales, donde en cada bloque de SI o SINO, pueden existir nuevas condiciones y dentro de estas nuevos procesos y así
//sucesivamente

//Diseñe un algoritmo de notas las cuales el usuario, entregue una calificacion , si tiene >90= es una A, si tiene >=80 obtiene una
//B, si tiene >=70 obtiene una C,si tiene >=60 tiene una D , si obtiene <=50 obtuvo una F

fun main(args:array<string>){
    val reader =
    scanner(System.'in')
  printl("Ingrese su calificacion: ")
  val grade =reader.nextInt()
  if (grade >=90){
    print("Obtuvo una A")
  }else{
    if(grade>=80){
        print("Obtuvo una B")
    }else{
        if (grade >=70){
            print("Obtuvo una C")

        }else{
            if(grade >=60){
                print("Obtuvo una D")
            }else{
                println("obtuvo una F")
            }
        }
    }
  }
}