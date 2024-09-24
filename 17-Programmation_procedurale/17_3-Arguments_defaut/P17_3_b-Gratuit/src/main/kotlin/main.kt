fun tip(bill: Int, percentage: Int = 10): Int {
    return bill*percentage/100
}

fun main() {
    println(tip(100))
    println(tip(100, 5))
}