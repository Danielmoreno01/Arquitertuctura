import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)  //para tener la entrada de los codigos del usuario
    var intentos = 0   //deja el contador en 0
    var Bienvenido = false  //hasta qeu se demuestre lo contrario //con el codigo o bloqueo

    while (intentos < 3 && !Bienvenido) {    //cantidad de itentos antes de boom
        print("Ingrese su código de acceso: ")
        var codigo = scanner.nextInt()

        when (codigo / 1000) {    //profe! esto lo tengo en duda!  (y/n)
            1 -> {
                println("Empleado $codigo, ID Bienvenid@") //$interpola las cadenas
                Bienvenido = true  //pa entro
            }
            2 -> {
                print("Ingrese nombre completo: ")
                var nombre = scanner.next()  //leeer la palabra ingresada
                print("Motivo de la visita: ")
                var motivo = scanner.next()
                println("Bienvenid@  Mr.$nombre, agradecemos la la visita para: $motivo")
                Bienvenido = true
            }

            else -> {
                println("Intenta nuevamente .")
                intentos++
            }
        }
    }

    if (!Bienvenido) {
        println(
            """Sin intentos! 
            |Contactese con soporte
            |**********BLOQUEADO**********.""".trimMargin()
        )
    }
    scanner.close()
}
