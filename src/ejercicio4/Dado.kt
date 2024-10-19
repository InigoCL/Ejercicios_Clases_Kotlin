package ejercicio4

import kotlin.random.Random

fun main(args: Array<String>) {
    var dado1 = Dado(7)
    println(dado1.valor)

    println("-----------------------------")

    val dado2 = Dado(6)
    println(dado2.valor)
    dado2.generarValor()
    dado2.imprimirValor()

}

class Dado(var valor: Int){

    init {
        if (valor  !in 1..6){
            valor = 1
        }
    }

    fun generarValor(){
        valor = Random.nextInt(0,7)
    }
    fun imprimirValor(){
        println(valor)
    }
}