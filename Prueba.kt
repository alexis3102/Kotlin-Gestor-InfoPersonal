fun main() {
fun main() {

    println("¿Cuál es tu nombre completo?")
    val name = readLine()!!

    val nameModificado = name?.uppercase()

    println("Original: $name")
    println("Modificado: $nameModificado")

    println("escribe tu edad")
    var edad = readLine()!!.toInt()
    // !! le dice al programa que si es null que salte error pero de contrario que lo use normal como double
    if (edad < 0){
        println("edad invalida")
    }else{
        println("su edad es valida")
    }
    if (edad > 18){
        println("usted es mayor de edad")
    }else{
        println("usted es menor de edad")
    }

    println("escriba su altura")
    val altura = readLine() !!.toDouble()
    if (altura > 0){
        println("su altura es valida")
    }else{
        println("su altura es invalida")
    }

    println("escriba su peso")
    val peso = readLine()!!.toDouble()
    if (peso > 0){
        println("su peso es valido")
    }else{
        println("su peso es invalido")
    }

    var IMC = (peso/(altura*altura))
    println("su IMC es: $IMC")

    println("escriba su gmail")
    val email = readLine()!!

    val dominio = email.substringAfter("@")
    println("Dominio del email: $dominio")
    //Valida que el email tenga al menos un “@” y un “.”.
  val result = email.contains("@") && email.contains(".")
    if (result == true){
        println("su correo es valido")
    }else{
        println("su correo no es valido")
    }
    println("escriba sue ciudad")
    val ciudad = readLine()!!

    val resumen = """ 
        //////////////////////////////////////////////////
        su nombre es: $name
        su nombre en mayusculas: ${name.uppercase()}
        su nombre en minusculas: ${name.lowercase()}
        su edad es: $edad años
        su altura es: $altura m
        su peso es: $peso kg
        email es: $email
        su dominio es: $dominio
        ciudad es: $ciudad
        --------------------------------------------------
    """.trimIndent()

    println(resumen)

    println("¿Cuál es tu nombre completo?")
    val name2 = readLine()!!

    val nameModificado2 = name2?.uppercase()

    println("Original: $name2")
    println("Modificado: $nameModificado2")

    println("escribe tu edad")
    var edad2 = readLine()!!.toInt()
    // !! le dice al programa que si es null que salte error pero de contrario que lo use normal como double
    if (edad2 < 0){
        println("edad invalida")
    }else{
        println("su edad es valida")
    }
    if (edad2 > 18){
        println("usted es mayor de edad")
    }else{
        println("usted es menor de edad")
    }

    println("escriba su altura")
    val altura2 = readLine() !!.toDouble()
    if (altura > 0){
        println("su altura es valida")
    }else{
        println("su altura es invalida")
    }

    println("escriba su peso")
    val peso2 = readLine()!!.toDouble()
    if (peso2 > 0){
        println("su peso es valido")
    }else{
        println("su peso es invalido")
    }

    var IMC2 = (peso/(altura*altura))
    println("su IMC es: $IMC2")

    println("escriba su gmail")
    val email2 = readLine()!!

    val dominio2 = email.substringAfter("@")
    println("Dominio del email: $dominio2")
    //Valida que el email tenga al menos un “@” y un “.”.
    val result2 = email.contains("@") && email2.contains(".")
    if (result2 == true){
        println("su correo es valido")
    }else{
        println("su correo no es valido")
    }
    println("escriba sue ciudad")
    val ciudad2 = readLine()!!

    val resumen2 = """ 
        //////////////////////////////////////////////////
        su nombre es: $name2
        su nombre en mayusculas: ${name2.uppercase()}
        su nombre en minusculas: ${name2.lowercase()}
        su edad es: $edad2 años
        su altura es: $altura2 m
        su peso es: $peso2 kg
        email es: $email2
        su dominio es: $dominio2
        ciudad es: $ciudad2
        --------------------------------------------------
    """.trimIndent()

    println(resumen2)

    println("¿Cuál es tu nombre completo?")
    val name3 = readLine()!!

    val nameModificado3 = name3?.uppercase()

    println("Original: $name3")
    println("Modificado: $nameModificado3")

    println("escribe tu edad")
    var edad3 = readLine()!!.toInt()
    // !! le dice al programa que si es null que salte error pero de contrario que lo use normal como double
    if (edad3 < 0){
        println("edad invalida")
    }else{
        println("su edad es valida")
    }
    if (edad3 > 18){
        println("usted es mayor de edad")
    }else{
        println("usted es menor de edad")
    }

    println("escriba su altura")
    val altura3 = readLine() !!.toDouble()
    if (altura3 > 0){
        println("su altura es valida")
    }else{
        println("su altura es invalida")
    }

    println("escriba su peso")
    val peso3 = readLine()!!.toDouble()
    if (peso3 > 0){
        println("su peso es valido")
    }else{
        println("su peso es invalido")
    }

    var IMC3 = (peso/(altura*altura))
    println("su IMC es: $IMC3")

    println("escriba su gmail")
    val email3 = readLine()!!

    val dominio3 = email.substringAfter("@")
    println("Dominio del email: $dominio3")
    //Valida que el email tenga al menos un “@” y un “.”.
    val result3 = email.contains("@") && email3.contains(".")
    if (result3 == true){
        println("su correo es valido")
    }else{
        println("su correo no es valido")
    }
    println("escriba sue ciudad")
    val ciudad3 = readLine()!!

    val resumen3 = """ 
        //////////////////////////////////////////////////
        su nombre es: $name3
        su nombre en mayusculas: ${name3.uppercase()}
        su nombre en minusculas: ${name3.lowercase()}
        su edad es: $edad3 años
        su altura es: $altura3 m
        su peso es: $peso3 kg
        email es: $email3
        su dominio es: $dominio3
        ciudad es: $ciudad3
        --------------------------------------------------
    """.trimIndent()
    println(resumen3)
}
}
