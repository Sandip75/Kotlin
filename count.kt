
fun main(args:Array<String>)
{
    var n:Int = readLine()!!.toInt()
    var a:Array<String> = Array<String>(n){readLine()!!}
    for(n1 in a ){

    }
    for (num in 0..n-1){
        var l=a[num].length
        var v:String ="aAeEiIoOuU"
        var count:Int=0
        for(i in 0..l-1){
            for(j in 0..9){
                if(a[num][i] ==v[j]){
                    println(a[num])
                    println(v[j])
                    count++
                    break
                }
            }
        }
        println(count)
    }



}


