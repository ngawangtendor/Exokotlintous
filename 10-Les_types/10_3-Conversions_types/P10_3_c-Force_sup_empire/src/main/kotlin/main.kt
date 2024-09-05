
fun main() {
    val empiresShip = readln().toDouble()
    val alliancesShip = readln().toDouble()
    val ratioDouble: Double = empiresShip / alliancesShip
    val ratio = ratioDouble.toInt()
    println(ratio)
}