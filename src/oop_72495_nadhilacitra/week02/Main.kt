package oop_72495_nadhilacitra.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.nextLine()

    // Validasi panjang NIM
    if (nim.length != 5) {
        println("NIM harus 5 karakter! Pendaftaran dibatalkan.")
        return
    }

    println("Status: Pendaftaran Selesai.")

    // === LANGKAH 6: Menu Pilihan (Interaction Loop) ===
    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine() // consume newline

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Memanggil Primary Constructor
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

    } else if (type == 2) {
        // Memanggil Secondary Constructor (tanpa jurusan)
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")

    } else {
        println("Pilihan tidak valid, pendaftaran batal!")
    }
}
