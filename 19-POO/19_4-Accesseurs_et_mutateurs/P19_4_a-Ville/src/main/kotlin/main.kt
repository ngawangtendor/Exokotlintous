class City(val name: String) {
    var population: Int
}

fun main() {
    val goodCity = City("Good City")
    val badCity = City("Bad City")

    badCity.population = 65_000_000
    println(badCity.population)

    goodCity.population = 45_000_000
    println(goodCity.population)
}