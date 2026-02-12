package oop_72495_nadhilacitra.week01

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) (price * 20) / 100
    else (price * 10) / 100

fun main() {
    val gameTitle = "Warnet Simulator"
    val price = 650_000
}
