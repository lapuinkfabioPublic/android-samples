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
    var lado1 =  readLine()!!.toInt()

    println("Informe o lado 2:")
    var lado2 =  readLine()!!.toInt()

    if(lado1 == lado2)
        println("é um quadrado")
    else
        println("não é um quadrado")


}

fun exEx(){
    var str: String? = "coxa"
    var abc = "obas"

    //tipo 01
    try
    {
        println(str!!.length)
        println(10/0)
        println(abc[100])
    }
    catch (e: NullPointerException)
    {
        println(e)
    }
    catch (e: ArithmeticException)
    {
        println(e)
    }
    catch (e: StringIndexOutOfBoundsException)
    {
        println(e)
    }
    catch (e: Exception)
    {
        println(e)
    }
    finally {
        println("OK")
    }

    var str2 =  str ?: "teste"

    println(str2 )

}