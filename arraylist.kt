/**
 * Created by pc on 10/2/2017.
 */

fun main(args:Array<String>)
{
    var arraylist = ArrayList<String>()
    arraylist.add("Hello")
    arraylist.add(" Sandip")
    arraylist.add(" welcome ")
    arraylist.add("to ")
    arraylist.add("delhi.     ")

    println("First name : "+  arraylist.get(1))

    //printing whole arraylist using object
    for(item in arraylist)
    {
        print(item)
    }

    //printing whole arraylist using index
    for(index in 0..arraylist.size-1)
    {
        print(arraylist.get(index))
    }

    //search in arraylist
    if(arraylist.contains(" Sandip"))
    {
        print("\n The name is found ")
    }
    else
    {
        print("\n The name is not found ")
    }
}
