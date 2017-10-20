/**
 * Created by pc on 9/30/2017.
 */
fun main(args:Array<String>)
{
    var arrayint = Array<Int>(size = 5){0}
    arrayint[3]=56
    println("Arrayint[3] is  "+arrayint[3])

    println("Array elements by object ")
    for(elments in arrayint)
    {
        println(elments)
    }
    println("Array elements by index ")
    for(index in 0..4)
    {
        println(arrayint[index])
    }

    //taking array as string
    var arraystring = Array<String>(4){""}
    for(index in 0..3)
    {
        println("arraystring [$index] = ")
        arraystring[index]= readLine()!!
    }
    for (index in 0..3)
    {
        println("arraystring [$index] = "+arraystring[index])
    }
}

