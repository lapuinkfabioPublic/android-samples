import java.util.function.ToIntFunction

fun main(){

    println("Digite o Tipo")
    var tipo = readln().toInt()
    println("Total Anos Experiência")
    var anos = readln().toInt()

    var bonus  = bonus(tipo, anos)


    println(" O Bonus foi de : %f".format(bonus))

    //programa é sob fazer sozinho, sem usar rodinhas...
    //nao é ser um asiatico produtivo de uma fabrica da foxconn
    //programar é pode estar aqui no computador e fazer magica
}

fun bonus(Tipo : Int, Anos: Int) : Float{


    return if (Tipo == 0) {
        if(Anos < 2)
            2000F //Gerentes
        else
            3000F
    } else if (Tipo == 1)
    {
        if(Anos < 2)
            1500F //Gerentes
        else
            1800F
    }
    else if (Tipo == 2)
        1000F //Eng Software
    else if (Tipo == 3)
        500F //Estagiários
    else
        0F

}
