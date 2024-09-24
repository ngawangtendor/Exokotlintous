// fix it
class VinylStore(var vinyl: String) {
    fun printVinyl() {
        println(this.vinyl)
    }
}

fun main() {
    val myStore = VinylStore("Vinyl Record")
    myStore.printVinyl()
}