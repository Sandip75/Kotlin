/**
 * Created by pc on 9/30/2017.
 */
fun main(args:Array<String>)
{
    //continue
    for(i in 1..10)
    {
        if(i==3)
            continue
        //println("the value of index $i")
    }
    //break
    for(j in 1..10)
    {
        if(j==3)
            break
        //println("the value of index $j")
    }

    //return
    for(k in 1..10)
    {
        if(k==3)
            return
        //println("the value of index $k")
    }
}
