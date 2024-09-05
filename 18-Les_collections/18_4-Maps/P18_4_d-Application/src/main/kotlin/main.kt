
fun main() {
    println(bill(mapOf("Cola" to 500, "Apple" to 1500, "Banana" to 300), mutableListOf("Cola", "Apple")))
    println(bill(mapOf("Sprite" to 150, "Lays" to 200, "Milk" to 600, "Snickets" to 100), mutableListOf("Sprite", "Lays", "Coffee")))
}

fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
    // put your code here
}