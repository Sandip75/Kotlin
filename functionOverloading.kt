/**
 * Created by pc on 10/2/2017.
 */

fun sum(n1:Int,n2:Int):Int
{
    return n1+n2
}
fun sum(n1:Int,n2:Int,n3:Int):Int
{
    return n1+n2+n3
}
fun sum(n1:Int,n2:Int,n3:Int,n4:Int):Int
{
    return n1+n2+n3+n4
}


fun main(args:Array<String>)
{
    var s1=sum(2,4)
    println("The sum is $s1 ")

    var s2=sum(2,4,5)
    println("The sum is $s2 ")

    var s3=sum(2,4,5,2)
    println("The sum is $s3 ")
}