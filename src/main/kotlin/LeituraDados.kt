fun main(){

    println("Dados: ")
    println(chars("Hello World!"))

    println("Digite o valor:")
    var valor = readLine()!!.toInt()

    println(tempo(valor))


}

fun tempo( ano : Int) {

    print("Meses %d ".format(ano * 12))
    print("Horas %d ".format(ano * 12 * 24))
    print("Minutos %d ".format(ano * 12 * 24 * 60))
    print("Segundos %d ".format(ano * 12 * 24 * 60 * 60))
}

fun chars( palavra: String) : Int {
    return palavra.length

}