package oop_72495_nadhilacitra.week10

interface HasName {
    val name: String
}

data class Coin(
    override val name: String,
    val balance: Double
) : HasName

data class Transaction(
    val id: String,
    val amount: Double
)