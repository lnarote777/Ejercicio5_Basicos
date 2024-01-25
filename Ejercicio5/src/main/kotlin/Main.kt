fun main(args: Array<String>) {

    try {
        println("Introduzca la hora:")
        val hora = readln().toInt()

        println("Introduzca los minutos:")
        val minutos = readln().toIntOrNull()

        println("Introduzca los segundos")
        val segundos = readln().toIntOrNull()

        if (minutos != null || segundos != null)

        val tiempo = Tiempo(hora, minutos, segundos)

        print(tiempo.toString())
    }catch (e: Exception){
        print("**ERROR** Caracter no válido. Debe ser un número entero")
    }


}