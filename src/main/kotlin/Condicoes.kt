import java.util.function.ToIntFunction

fun main(){

    println("Digite o Tipo")
    var tipo = readln().toInt()

    var bonus  = bonus(tipo)

    println(" O Bonus foi de : %f".format(bonus))

    //programa é sob fazer sozinho, sem usar rodinhas...
    //nao é ser um asiatico produtivo de uma fabrica da foxconn
    //programar é pode estar aqui no computador e fazer magica
}

fun bonus(Tipo : Int) : Float{


    if (Tipo == 0)
        return 2000F //Gerentes
   else if (Tipo == 1)
        return 1500F //Cordenadores
   else if (Tipo == 2)
        return 1000F //Eng Software
    else if (Tipo == 3)
        return 500F //Estagiários
    else
        return 0F

}
