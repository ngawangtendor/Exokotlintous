fun checkSpeed(speed : Int, limit : Int = 60) {
    // write your code here
    if (speed > limit){
        var km = speed - limit
        println("Exceeds the limit by $km Kilometers per hour")
    }else{
        println("Within the limit")
    }
}

fun main() {
    checkSpeed(100, 60)
    checkSpeed(40, 90)
    checkSpeed(61)
    checkSpeed(60)
}