fun main() {


    var palavra = leString()
    println(TrocaString(palavra ))
    println("Temperatura %f F".format(CelsiusFahrenheit(10.0)))
    println("Milhas %f".format(milhas(8.0)))
    println("Dados: ")
    println(chars("Hello World!"))

    println("Digite o valor:")
    var valor = readLine()!!.toInt()

    println(tempo(valor))


}

fun tempo(ano: Int) {

    print("Meses %d ".format(ano * 12))
    print("Horas %d ".format(ano * 12 * 24))
    print("Minutos %d ".format(ano * 12 * 24 * 60))
    print("Segundos %d ".format(ano * 12 * 24 * 60 * 60))
}

fun chars(palavra: String): Int {
    return palavra.length

}

fun milhas(milhas: Double): Double {
    return milhas * 1.6

}

fun ex3(n: Double): Double {
    return n * 3
}

fun CelsiusFahrenheit(celsius : Double): Double
{
    return  (celsius * 9 / 5 ) + 32
}

fun leString() : String
{
    println("Digite uma string:")
    return readln()

}
fun TrocaString(palavra : String) : String
{
    return palavra.lowercase().toString().replace("a","X", true)
}