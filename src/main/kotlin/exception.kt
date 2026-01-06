fun main()
{
    val szPalavra  : String?
    szPalavra = null

    println(szPalavra?.length)
   // println(szPalavra!!) //neste caso, pode lancar a exception pq eu garanto que vou tratar

    var abc = readLine()
    if (abc != null)
    {
        println("Valor não nulo")
    }
    else
    {
        println("valor nulo")
    }
}

