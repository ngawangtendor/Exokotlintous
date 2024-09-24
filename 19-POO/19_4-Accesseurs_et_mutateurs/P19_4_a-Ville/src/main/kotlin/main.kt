class City(val name: String) {
    var population: Int = 0
    constructor(name: String, population: Int): this(name)
    {
        if (population > 50_000_000){
            this.population = 50_000_000
        }else if( population < 0){
            this.population = 0
        }
        else {
            this.population = population
        }
    }


}

fun main() {
    val goodCity = City("Good City", 45_000_000)
    val badCity = City("Bad City", 60_000_000)

    //badCity.population = 65_000_000
    println(badCity.population)

    //goodCity.population = 45_000_000
    println(goodCity.population)
}