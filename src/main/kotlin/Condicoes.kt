import java.util.function.ToIntFunction

fun main(){
    repeticao(10)
//portaria()
}

fun repeticao(Vezes : Int)
{
        for(i in 1..Vezes step 2)
        {
            if(i >= 4)
                break
            println(i)

        }

    for(i in Vezes  downTo 0 step 2)
    {
        println(i)
    }

}
fun bonus()
{
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
fun portaria(): Boolean{
    print("Informe a idade para o portaria")
    var Idade = readln().toInt()

    print("Informe o tipo de convite")
    var Tipo = readln().toInt()
    print("Informe o codigo do convite")
    var Codigo = readln()

    if(Idade < 18) {
        println("Acesso Negado. Menores de Idade não são permitidos")
        return false
    }

    when(Tipo){
        1->{
            println("Comum")
        }
        2->{
            println("Premium")
        }
        3->{
            println("Luxo")
        }
        in (4..5)->
        {
            println("Diamante")
        }
        else -> {
            println("Acesso Negado. Tipo de codigo do convite")
            return false
        }
    }
    if(Tipo == 1) {
        println("Comum")
    }
    else if(Tipo == 2) {
        println("Premium")
    }
    else if(Tipo == 3) {
        println("Luxo")
    }
    else
        println("Acesso Negado. Tipo de convite não reconhecido")
    if(Codigo.startsWith("XL")) {
        println("Premium or Luxo")
    }
   else if(Codigo.startsWith("XT")) {
        Tipo = 3
        println("Comum")
    }
    else
    {
        println("Acesso Negado. Tipo de codigo do convite")
        return false

    }

    println("Welcome ")

    return true
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
