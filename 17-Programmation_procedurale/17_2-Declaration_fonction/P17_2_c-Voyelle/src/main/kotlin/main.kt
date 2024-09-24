// write your function here
fun isVowel(firstLetter : Char) : Boolean{

    // Définir les voyelles majuscules et minuscules
    val vowels = "AEIOUaeiou"

    // Vérifier si la lettre est dans la chaîne des voyelles
    return firstLetter in vowels
}
fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
