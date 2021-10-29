class Persona
{
    var nombre: String = ""
    var edad: Int = 0
    var DNI: String = ""
    var sexo:Char = 'H'
    var peso: Double = 0.0
    var altura: Double = 0.0

    override fun toString(): String {
        return "$nombre, $edad, $DNI, $sexo, $peso, $altura"
    }

    constructor(nombreB: String, edadB: Int, sexoB: Char, pesoB: Double, alturaB:Double){
        this.nombre = nombreB
        this.edad = edadB
        this.sexo = sexoB
        this.peso = pesoB
        this.altura = alturaB
    }

    constructor(nombreC: String, edadC: Int, sexoC: Char){
        this.nombre = nombreC
        this.edad = edadC
        this.sexo = sexoC
    }



    fun calcularIMC(): Int {
        var IMC = peso * (altura * altura)

        if  (IMC<20)
        {
            println("Estas en tu peso ideal")
            return -1
        }

        if (IMC in 20.0..25.0)
        {
            println("Estas por debajo de tu peso ideal")
            return 0
        }

        if (IMC>25)
        {
            println("Tienes sobrepeso")
            return 1
        }

        return 0

    }
    fun esMayorDeEdad(): Boolean {
        if (edad>=18)
        {
            print("Es mayor de edad")
            return true
        }
        else
        {
            print("Es menor de edad")
            return false
        }
    }
    fun comprobarSexo(sexoEsperado: Char)
    {
        if (sexoEsperado == sexo)
        {

        }
        else
        {
            sexo = 'H'
        }
    }
    //fun toString(){}
    fun generarDNI()
    {
        var continuar: Int = 0

        while (continuar != 8) {
            val numerorandom = (0..9).random()
            DNI = DNI + numerorandom
            continuar++
        }

        val letrarandom = ('A'..'Z').random()
        DNI = DNI + letrarandom
        println("$DNI")

    }
}

fun main() {


    println("Introduce los siguientes datos")
    print("Nombre: ")
    var nombre = readLine().toString()
    print("Edad: ")
    var edad = readLine()?.toInt()!!
    print("Peso: ")
    var peso = readLine()?.toDouble()!!
    print("Altura: ")
    var altura = readLine()?.toDouble()!!
    print("Sexo: ")
    var sexo = readLine()!![0]

    var persona1 = Persona(nombre,edad,sexo,peso,altura)
    var persona2 = Persona(nombre,edad, sexo)
    //var persona3 = Persona()



    persona1.calcularIMC()
    persona2.calcularIMC()
    //persona3.calcularIMC()


    persona1.esMayorDeEdad()
    persona2.esMayorDeEdad()
    //persona3.esMayorDeEdad()

    println("$persona1")
    println("$persona2")
    //println("$persona3")

}