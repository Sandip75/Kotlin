/**
 * Created by pc on 10/2/2017.
 */

fun main(args:Array<String>)
{
    var map = HashMap<Int,String>()
    map.put(1,"Sandip")
    map.put(2,"Sajal")
    map.put(3,"Uday")
    map.put(4,"Rahul")

    println("The value at key 4 ${map.get(4)}")

    //updating
    map.put(4,"Ankush")

    //printing hashmap
    for(item in map.keys)
    {
        print(map.get(item))
        println(item)
    }

}