
fun main(args:Array<String>)
{
    var n:Int = readLine()!!.toInt()
    var a:ArrayList<Long> = ArrayList<Long>()
    for (num in 0..n-1){
        a[num] = readLine()!!.toLong()
    }
    val k:Long = readLine()!!.toLong()

    for(num1 in 0..n-1){
        if(a[num1] ==k){
            print(num1)
            return
        }
    }
}


