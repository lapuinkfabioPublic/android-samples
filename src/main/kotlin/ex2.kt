import java.lang.Exception




//buscar sempre a inteligencia, buscar aprender, se nutrir, bons pensamentos
//investir em hardware, conforto alimentação , para si e para aqueles que trabalham com vc
//criar um ambiente leve. NOT IBM, mais HSBC GLTB
fun main(){
    verificaQuadrado()
}

fun verificaQuadrado()
{
    println("Informe o lado 1:")
    val lado1 =  lerInt()

    println("Informe o lado 2:")
    val lado2 =  lerInt()

    if(lado1 == lado2)
        println("lados iguais...")
    else
        println("não é um quadrado")
}
/*
* Leitura de um Inteiro, evitando erros
* */
fun lerInt(): Int
{
    var leituraInt : Int

    while(true) {
        try {
            println("Number >0:")
            leituraInt = readln().toInt()
            if(leituraInt > 0) //Regra 1 - Somente Numeros Positivos
                break

        } catch (_: Exception) {

        }
    }

    return leituraInt

}

