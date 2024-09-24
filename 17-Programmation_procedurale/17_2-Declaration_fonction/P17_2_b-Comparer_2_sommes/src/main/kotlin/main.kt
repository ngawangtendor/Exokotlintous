// write your function here
fun isGreater(number1 : Int, number2 : Int, number3: Int, number4: Int) : Boolean{
    if (number1 >= number3 && number2 > number4){
        return(true)
    }else{
        return(false)
    }
}
fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}
