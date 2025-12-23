import java.util.Locale
import java.util.function.ToIntFunction

fun main(){

    var str="Hello World"
    println(str[0])

    println(str.length)
    println(str.startsWith("Hello"))
    println(str.endsWith("orld"))
    println(str.substring(6))
    println(str.substring(6, 8))
    println(str.replace("o","O"))
    println(str.lowercase())
    println(str.uppercase())

    println(str.contains("Hello"))

    var nome = "Fabio"
    println("Ola $nome")

    str.isEmpty()
    println(str.trim())

    println("Olá %s".format(nome))

    //%s - String
    //%d - Int
    //%f - Ponto Flutuante
    //%c - Char
    //%b - Boolean

    val value = 5
    val salario = 16855.95

    println("%.2f  %d ".format(salario, value))

    println("%.2f  %09d ".format(Locale.US, salario, value))
}

fun main44(){

    var a: Byte = 0
    var b: Short = 5
    var c: Int = 10
    var d: Long = 15L
    var e: Float = 20F
    var f: Double = 250000.0

    println(f.toInt().toByte())
    println(f.toInt().toShort())
    f.toFloat()

}

fun media2(n1 : Int = 0, n2 : Int = 0) : Int =  (n1 + n2) / 2
fun media3(n1 : Int = 0, n2 : Int = 0)  =  (n1 + n2) / 2

fun media(n1 : Int = 0, n2 : Int = 0) : Int
{
    return (n1 + n2) / 2

}

fun hello(texto : String){
    println("Ola $texto")

}
//Fabio Leandro Lapuinka fabio
fun soma(a: Int, b: Int) : Int
{

    return a + b

}


/**
 * Documentação da minha função Quebrante
 * */
fun main6(args: Array<String>) {

    var str = "15"

    println(str.toInt())
    println(str.toDouble())
    println(str.toByte())
    println(str.toFloat())



    hello("oi")
    hello( texto = "mundo")
    println(media(4,2).toString())

    var num1: Int = 0
    var num2: Int = 0
    var op = "+"
    while (op != "s") {
        println("Digite num1:")
        num1 = readln().toInt()
        println("Digite num2")
        num2 = readln().toInt()
        println("Digite a operacao (+,/,%,++,--,(s)sair)")
        op = readln()

        when (op){
            "+"->
            {
                println("Soma: ${num1 + num2}")
            }
            "/"->
            {
                println("Divisão: ${num1 / num2}")
            }
            "%"->
            {
                println("Módulo: ${num1 % num2}")
            }
            "++"->
            {
                println("Incremento num1: ${++num1}")
                println("Incremento num2: ${++num2}")
            }
            "--"->
            {
                println("Decremento num1: ${--num1}")
                println("Decremento num2: ${--num2}")
            }
            else -> println("Invalid option")
            ;
        }
    }
    println("Fim do Programa")
    readln()

}
fun main3(args: Array<String>) {

    var nome = ""
    var numero =""

    println("Digite seu nome: ")
    nome =readln()

    println("Digite seu numero: ")
    numero = readln()

    var populacao = 212500000 //populacao do Brasil em 2025

    println("Seu nome é $nome")
    println("Seu numero é $numero")
    println("Populacao é $populacao")
    readln()

}
fun main2(){

    var base = 10
    var altura = 2


    println("Base: ${base} - Altura:${altura}: ${base*altura}")



}