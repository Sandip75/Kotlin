import java.util.*

/**
 * Created by pc on 9/28/2017.
 */
fun main(args:Array<String>)
{
    println("Enter your DOB ")
    var dob:Int= readLine()!!.toInt()

    var year =2017
    var age = year - dob

    println("Your age is $age")
}