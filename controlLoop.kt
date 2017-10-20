/**
 * Created by pc on 9/30/2017.
 */
fun main(args:Array<String>)
{
    //When we have more than one loop
    loop1@for(n1 in 1..5)
    {
        for(n2 in 1..5)
        {
            if(n2==3)
                break@loop1
            println("the value of index $n1 and $n2")
        }
    }
}
