import java.util.Locale
import java.util.Locale.getDefault

fun main() {

    var dia = 0
    println(DiaSemana(dia))

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
    if(!palavra.contains("a"))
        return palavra.uppercase(getDefault()).toString()
    return palavra.lowercase().toString().replace("a","X", true)
}
fun DiaSemana(dia: Int): String {
    if(dia == 0)
        return "Domingo"
    else if(dia == 1)
        return "Segunda"
    else if(dia == 2)
        return "Terça"
    else if(dia == 3)
        return "Quarta"
    else if(dia == 4)
        return "Quinta"
    else if(dia == 5)
        return "Sexta"
    else if(dia == 6)
        return "Sábado"
    else
        return dia.toString()
}