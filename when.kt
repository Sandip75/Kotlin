/**
 * Created by pc on 9/30/2017.
 */

fun main(args:Array<String>)
{
    println("Enter a number ")
    var n= readLine()!!.toInt()
    when(n){
        1->{
            print("you enter value $n ")
        }
        2->print("you enter value $n ")
        3,4->print("you enter value 3 or 4 == $n ")
        in 2..10->{
            print("2 to 10 you enter value $n ")
        }
        !in 15..20->{
            print("15 to 20 you enter value $n ")
        }
        else->{
            print("you enter value $n and out of range  ")
        }
    }
}
