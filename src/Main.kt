fun main() {
    var mon1 = 0
    var mon2 = 0
    var mon3 = 0
    var mon4 = 0
    var mon5 = 0

    while (true) {
        println(
            """Hola soy tu alcancía de confianza 
            ¿Qué deseas hacer el día de hoy?
            1. Agregar monedas.
            2. Ver monedas acumuladas.
            3. Calcular dinero acumulado.
            4. Romper y vaciar la alcancía.
            5. Salir.
        """.trimMargin()
        )

        val opcion = readln().toInt()

        when (opcion) {
            1 -> {
                println(
                    """¿Qué moneda vas a ingresar?
                        |1: 20
                        |2: 50
                        |3: 100
                        |4: 200
                        |5: 500
                    """.trimMargin()
                )

                val moneda = readln().toInt()
                when (moneda) {
                    1 -> mon1++
                    2 -> mon2++
                    3 -> mon3++
                    4 -> mon4++
                    5 -> mon5++
                    else -> println("Denominación no válida")
                }
            }
            2 -> {
                println("Monedas acumuladas:")
                println("20: $mon1")
                println("50: $mon2")
                println("100: $mon3")
                println("200: $mon4")
                println("500: $mon5")
            }
            3 -> {
                val total = (mon1 * 20) + (mon2 * 50) + (mon3 * 100) + (mon4 * 200) + (mon5 * 500)
                println("Dinero acumulado: $$total")
            }
            4 -> {
                val total = (mon1 * 20) + (mon2 * 50) + (mon3 * 100) + (mon4 * 200) + (mon5 * 500)
                mon1 = 0
                mon2 = 0
                mon3 = 0
                mon4 = 0
                mon5 = 0
                println("Alcancía vaciada. Total retirado: $$total")
            }
            5 -> {
                println("Saliendo del programa.")
                break
            }
            else -> println("Opción incorrecta")
        }
    }
}


