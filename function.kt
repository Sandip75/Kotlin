/**
 * Created by pc on 10/2/2017.
 */

fun welcome()
{
    println("Welcome to kotlin ")
}

fun sumNoReturnType(num1: Int,num2: Int):Unit
{
    val sum = num1 + num2
    println("The sum is $sum")
}
fun sumWithReturnType(num1:Int,num2: Int):Int
{
    return num1+num2
}


fun main(args:Array<String>)
{
    welcome()

    sumNoReturnType(12,34)
    sumNoReturnType(667,3)

    var sum = sumWithReturnType(23,45)
    println("The sum is $sum")
}