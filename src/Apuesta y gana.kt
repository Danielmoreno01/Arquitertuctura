import kotlin.random.Random

fun main() {
    println("Bienvenido, esto es apuesta y gana")

    var dinero: Int

    print("Por favor, ingresa la cantidad que quieres apostar: ")
    dinero = readLine()?.toIntOrNull() ?: 0

    if (dinero <= 0) {
        println("Debes ingresar una cantidad válida de dinero para jugar.")
        return
    }

    println("La cantidad ingresada es de: $dinero")

    while (dinero > 0) {
        val Naleatorio = Random.nextInt(1, 4)

        println( """Que empiecen las apuestas,
            |el numero aleatorio es:
            |-------> $Naleatorio """.trimMargin() )

        when (Naleatorio) {
            1 -> {
                dinero *= 2
                println("¡Felicidades! Has duplicado tu dinero. Ahora tienes: $dinero")
            }
            2 -> {
                dinero /= 2
                println("Has perdido la mitad de tu dinero. Ahora tienes: $dinero")
            }
            3 -> {
                dinero = if (dinero > 1) dinero / 2 else 0
                println("Lo siento, perdiste la mitad o todo tu dinero. Ahora tienes: $dinero")
            }
        }

        if (dinero <= 0) {
            println("Te has quedado sin dinero. El juego ha terminado.")
            break
        }

        print("¿Quieres seguir apostando? (S/N): ")
        val respuesta = readLine()?.uppercase()
        if (respuesta == "N") {
            println("Gracias por jugar. Te retiras con: $dinero")
            break
        } else if (respuesta == "S") {
            println("¡Sigue apostando! Has acumulado en tu bolsa $dinero")
        } else {
            println("Entrada no válida. Por favor, ingresa S para seguir o N para salir.")
        }
    }
}