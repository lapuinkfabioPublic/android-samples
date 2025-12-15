import java.util.function.ToIntFunction


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
fun main(args: Array<String>) {

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