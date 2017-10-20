/**
 * Created by pc on 9/27/2017.
 */

//This is main function
fun main(args:Array<String>)
{
    /*
    * name
    * age
    */
    println("Enter the name")
    var name = readLine()
    println("Enter the age ")
    var age:Int = readLine()!!.toInt()

    println(name + "  " + age )
}