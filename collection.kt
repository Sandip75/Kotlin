/**
 * Created by pc on 10/2/2017.
 */

fun main(args:Array<String>)
{
    //arrayof
    var arr= arrayOf(21,20,19,18,17,16,15)
    println("arr[2] : ${arr[2]}")

    //mapof
    var map= mapOf(1 to "Sandip",2 to "Rahul")
    println(map.get(1))
    println(map[1])

    //Listof
    var list= listOf<Int>(23,45,67,23)
    //list[3]=56
    for(i in list)
    {
        println(i)
    }

    //Listof
    var list1= mutableListOf<Int>(223,45,67,89,90)
    list1[3]=56
    for(i in list1)
    {
        println(i)
    }


    //setof
    var set = setOf<Int>(33,53,21,52,21,33,53,67)
    for(i in set)
    {
        println(i)
    }

    //mutablesetof
    var set1 = mutableSetOf<Int>(33,53,21,52,21,33,53,67)
    set1.add(78)
    set1.add(67)
    for(i in set1)
    {
        print("$i   ")
    }
    println()
    set1.remove(33)
    for(i in set1)
    {
        print("$i   ")
    }
}