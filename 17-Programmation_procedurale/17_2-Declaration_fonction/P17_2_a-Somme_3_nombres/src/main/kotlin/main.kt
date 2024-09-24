// write your function here

fun sum(a:Int, b: Int, c : Int){
    println(a.toInt() + b.toInt() + c.toInt())
}

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(sum(a, b, c))
}

