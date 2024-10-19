package ejercicio2

fun main(args: Array<String>) {

    val triangulo1 = Triangulo(10, 10, 10)
    triangulo1.inicializarPropiedades(triangulo1.lado1, triangulo1.lado2, triangulo1.lado3)
    triangulo1.imprimirLadoMayor()
    println(triangulo1.esEquilatero(triangulo1.lado1, triangulo1.lado2, triangulo1.lado3))

    println("------------------------------------------------------------")

    val triangulo2 = Triangulo(10, 10, 20)
    triangulo2.inicializarPropiedades(triangulo2.lado1, triangulo2.lado2, triangulo2.lado3)
    triangulo2.imprimirLadoMayor()
    println(triangulo2.esEquilatero(triangulo2.lado1, triangulo2.lado2, triangulo2.lado3))
}

class Triangulo (var lado1: Int,var lado2: Int,var lado3: Int) {

    fun inicializarPropiedades(l1: Int, l2: Int, l3: Int) {
        lado1=l1
        lado2=l2
        lado3=l3
    }
    fun imprimirLadoMayor(){
        if(lado1>lado2 && lado1>lado3){
            println("El lado mayor es el lado 1 que mide: $lado1")
        }else if(lado2>lado3 && lado2>lado1){
            println("El lado mayor es el lado 2 que mide: $lado2")
        }else if(lado3>lado1 && lado3>lado2){
            println("El lado mayor es el lado 3 que mide: $lado3")
        }else{
            println("No hay un lado mayor que los otros 2")
        }
    }
    fun esEquilatero(l1: Int, l2: Int, l3: Int): String{
        return if (l1 == l2 && l2 == l3){
            "EL triángulo es equilátero"
        }else{
            "El triángulo no es equilátero"
        }
    }
}
