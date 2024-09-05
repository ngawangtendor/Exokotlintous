class Car(val make: String, val year: Int) {

    var speed: Int = 0

    // write the methods here
}

fun main() {
    val myCar = Car("Mustang", 1976)
    myCar.accelerate()
    println(myCar.speed)
    myCar.decelerate()
    myCar.decelerate()
    println(myCar.speed)
}