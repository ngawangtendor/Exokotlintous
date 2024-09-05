fun main() {
    val map1 = mapOf("one" to "two", "three" to "one", "four" to "five")
    val value1 = "one"
    println(map1)
    println(value1)
    println(containsKeyAndValue(map1, value1))
    println()
    val map2 = mapOf("10" to "20", "30" to "1", "55" to "23")
    val value2 = "55"
    println(map2)
    println(value2)
    println(containsKeyAndValue(map2, value2))

}

fun containsKeyAndValue(map: Map<String, String>, value: String): Boolean {
    // put your code here
}