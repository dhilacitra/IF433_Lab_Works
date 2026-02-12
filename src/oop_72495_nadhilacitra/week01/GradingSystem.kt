package oop_72495_nadhilacitra.week01

fun calculateStatus(score: Int) =
    if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {
    val name = "John Doe"
    val score = 80

    println("Nama: $name, Nilai: $score")
    println("Status: ${calculateStatus(score)}")

    // --- Langkah 5: Null Safety ---

    val studentId: String? = null

    // Safe call + Elvis operator
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
}
