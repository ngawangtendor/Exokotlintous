// write the class Complex here
class Complex {
    var real : Double = 0.0
    var image : Double = 0.0
}

fun main() {
    val number1 = Complex()
    number1.real = 5.0
    number1.image = 2.0
    println(number1.real)
    println(number1.image)
}
