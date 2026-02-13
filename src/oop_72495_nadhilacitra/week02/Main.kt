package oop_72495_nadhilacitra.week02
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- Program Pencatat Peminjaman Buku ---")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi: tidak boleh minus
    if (duration < 0) {
        println("Durasi tidak boleh minus. Diubah menjadi 1 hari.")
        duration = 1
    }

    // Buat objek Loan
    val loan = Loan(title, borrower, duration)

    // Tampilkan hasil
    println("\n--- Detail Peminjaman ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")

    scanner.close()
}