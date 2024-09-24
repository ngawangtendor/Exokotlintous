// write the BankAccount class here

class BankAccount {
    var depositidv : Long
    var withdrawn : Long

    constructor(depositidv : Long, withdrawn : Long){
        this.depositidv = depositidv
        this.withdrawn = withdrawn
    }
    fun balance() {
        var resultat = depositidv - withdrawn
        println("balance ${resultat}")
    }
}

fun main() {
    val account = BankAccount(100, 20)
    println(account.balance())
}
