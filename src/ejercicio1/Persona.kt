package ejercicio1

class Persona(val nombre: String, val edad: Int) {

    fun imprimirPropiedades() {
        println("Nombre: $nombre, Edad: $edad")
    }

    fun esMayorDeEdad(): String {
        return if (edad >= 18) {
            "Si"
        } else {
            "No"
        }

    }

}

