
package oop_72495_nadhilacitra.week01

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) (price * 20) / 100
    else (price * 10) / 100

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    val safeNote = note ?: "Tidak ada catatan"

    println("=== SteamKW Receipt ===")
    println("Game: $title")
    println("Final Price: Rp $finalPrice")
    println("Catatan: $safeNote")
}

fun main() {
    val gameTitle = "Warnet Simulator"
    val price = 650_000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}
