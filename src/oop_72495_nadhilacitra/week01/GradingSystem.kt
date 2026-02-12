package oop_72495_nadhilacitra.week01

// Tulis DI LUAR main()
fun calculateStatus(score: Int) =
    if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {
    val name = "John Doe"
    val score = 80

    println("Nama: $name, Nilai: $score")

    // Panggil DI DALAM main()
    println("Status: ${calculateStatus(score)}")
}
