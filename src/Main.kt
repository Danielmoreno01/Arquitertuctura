/*
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
*/
fun main() {

    var VJavier = 0
    var VCris = 0             // Contadores de votos por cada candidato
    var VJeff = 0

    var CJavier = 0
    var CCris = 0       // Costos de campaña de cada candidato
    var CJeff = 0

    var NTVotos = 0           // Contador total de votos

    do {

        println(
            """ VOTACIONES MUNICIPIO PREMIER:
            1. Candidato a elegir
            2. Costo de campaña por candidato
            3. Vaciar Urnas
            4. Numero total de votos
            5. Porcentaje de votos por candidato
            6. Costo promedio de campaña
            7. Salir
            Opción:"""
        )

        var opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                print(" (1. Javier, 2. Cristian, 3. Jefferson): ")
                val candi = readLine()?.toIntOrNull() ?: 0
                print("Donde conociste al candidato (1. Internet, 2. Radio, 3. Televisión): ")
                val Vinfluenciado = readLine()?.toIntOrNull() ?: 0


                val costo = when (Vinfluenciado) {
                    1 -> 700000 // Internet
                    2 -> 200000 // Radio                // Costos según medio de influencia
                    3 -> 600000 // Televisión
                    else -> 0
                }


                if (candi == 1) {
                    VJavier++                            // Asignación de votos y costos
                    VJavier += costo
                } else if (candi == 2) {
                    VCris++
                    VCris += costo
                } else if (candi == 3) {
                    VJeff++
                    VJeff += costo
                } else {
                    println("Opción incorrecta.")
                }
                NTVotos++
            }

            2 -> {
                println("La campaña de Javier costo: \$$VJavier")
                println("La campaña de Cristian costo: \$$VCris")               // Ver costos de campaña
                println("La campaña de Jefferson costo: \$$VJeff")
            }

            3 -> {
                VJavier = 0
                VCris = 0
                VJeff = 0
                VJavier = 0                  //Reinicio gneral
                VCris = 0
                VJeff = 0
                NTVotos = 0
                println("Se han reiniciado las votaciones.")
            }

            4 -> println("Total de votos registrados: $NTVotos")
            5 -> {
                if (NTVotos > 0) {
                    println("Javivi: ${VJavier * 100 / NTVotos}%")
                    println("Cristian: ${VCris * 100 / NTVotos}%")                // Ver porcentaje de votos
                    println("Jefferson: ${VJeff * 100 / NTVotos}%")
                } else {
                    println("Votos 0")
                }
            }

            6 -> {
                val costoTotal = +VJeff + VJavier
                val costoPromedio =
                    if (NTVotos > 0) costoTotal / NTVotos else 0                // Ver costo promedio de campaña
                println("Costo promedio por campaña: \$$costoPromedio")
            }

            7 -> println("Saliendo----------------------------")
            else -> println("Intenta nuevamente.")
        }

    } while (opcion != 7)


}


