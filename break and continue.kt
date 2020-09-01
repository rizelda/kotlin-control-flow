fun main()
{
    val listOfInt = listOf(1, 2, 3, null, 6, null, 9 )
    for (i in listOfInt)
    {
        if (i == null) continue
        print(i)
    }
}