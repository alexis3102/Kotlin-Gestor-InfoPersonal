fun main(){
//    val name = "juan"
//    println("hola $name")
    for(i in 1..3) {

        println("escribe tu nombre completo: ")
        val nombre = readLine() ?: "invitado"
        println("registro compelto en mayusculas: ${nombre.uppercase()}")
        println("registro completo en minusculas: ${nombre.lowercase()}")
        //el ?: es para indicar que si el usuario le da enter sin escribir nada use "invitado", ya que el sistema no tolera valores null

        println("escribe tu edad: ")
        val edad = readLine()!!.toIntOrNull()?:-1

        if (edad >= 18) {
            println("usted es mayor de edad")
        } else if (edad > 0) {
            println("edad: $edad años")
        } else {
            println("edad inválida")
        }

        //!! esto le dice al lenguaje que si va resivir un valor y que no va ser null y el toInt es para que sea un entero
        println("escriba su altura: ")
        val altura = readLine()?.toFloatOrNull() ?: 1f
        // ? = es para valores null, por si lo llega a resivir no salte error
        // en 0f, si es null su valor es 0 y es double, pero si quiero que sea un float se le pone una f al final = 0f

        if (altura>0){
            println("altura: $altura m")
        }else{
            println("su altura es invalida")
        }

        println("escribe tu peso: ")
        val peso = readLine()?.toFloatOrNull() ?: 0f

        if (peso>0){
            println("peso: $peso kg")
        }else{
            println("su peso es invalido")
        }

        println("escribe tu Email: ")
        val email = readLine() ?: "no hay gmail"
        if (email.contains("@")&& email.contains(".")){
            //email.contains("@") si devuelve true si la cadena contiene @
            //email.contains(".") si devuelve true si la cadena contiene un punto
            // &&: si ambas condiciones son verdaderas
            println("email valido: $email")
        }else{
            println("su email es invalido")
        }

        val dominio = email.substringAfter("@")
        println("Dominio del email: $dominio")

        println("escriba tu ciudad de residencia: ")
        val ciudad = readLine() ?: "no hay ubicacion registrada"

        val imc = peso / (altura*altura)
        println("su IMC es: $imc")


        val resumen = """
            ----------------------------------
            resumen del usuario #$i
            Nombre original: $nombre
            Nombre MAYÚSCULAS: ${nombre.uppercase()}
            Nombre minúsculas: ${nombre.lowercase()}
            Edad: $edad años
            Altura: $altura m
            Peso: $peso kg
            IMC: $imc
            Email: $email
            Dominio del email: $dominio
            Ciudad: $ciudad
            ---------------------------------
            """.trimIndent()
        println(resumen)
    }
}