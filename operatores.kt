/**
 * Created by pc on 9/28/2017.
 */
fun main(args:Array<String>)
{
    println("Enter number 1 : ")
    var n1: Int = readLine()!!.toInt()
    println("Enter number 2 : ")
    var n2:Int = readLine()!!.toInt()
    var sum:Int?
    sum = n1 + n2
    println("The sum will be "+ sum)
    sum = ++n1 + n2
    println("The sum will be $sum ")
}
