package ejercicio1

fun main(args: Array<String>) {
    val persona1 = Persona("Jojopyun",20)
    persona1.imprimirPropiedades()
    println("Es ${persona1.nombre} mayor de edad? ${persona1.esMayorDeEdad()}")

    println("-----------------------------------------------------------")

    val persona2 = Persona("Elyoya",16)
    persona2.imprimirPropiedades()
    println("Es ${persona2.nombre} mayor de edad? ${persona2.esMayorDeEdad()}")
}

