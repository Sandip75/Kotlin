/**
 * Created by pc on 9/30/2017.
 */
fun main(args:Array<String>)
{
    var n1=4
    var n2=5
    var max = if(n1>n2) n1 else n2
    print("Max value is : $max ")

    //when
    var age = 33
    var isYoung = when(age)
    {
        30 -> true
        else ->false
    }
    print("you are young :  $isYoung ")
}
