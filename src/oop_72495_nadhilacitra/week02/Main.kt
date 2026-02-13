package oop_72495_nadhilacitra.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")

    // 1. Input hero
    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan base damage Hero: ")
    val damage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, damage)

    // 2. Enemy HP
    var enemyHp = 100

    // 3. Main battle loop
    while (hero.isAlive() && enemyHp > 0) {

        println("\n--- TURN ---")
        println("HP ${hero.name}: ${hero.hp}")
        println("HP Musuh: $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()
        scanner.nextLine()

        if (choice == 1) {
            hero.attack("Musuh")
            enemyHp -= hero.baseDamage

            if (enemyHp < 0) enemyHp = 0
            println("HP Musuh sekarang: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh menyerang balik!")
                hero.takeDamage(enemyDamage)
            }

        } else if (choice == 2) {
            println("${hero.name} kabur dari pertempuran!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    // 4. Hasil akhir
    println("\n=== HASIL PERTEMPURAN ===")

    if (!hero.isAlive()) {
        println("${hero.name} kalah! Musuh menang!")
    } else if (enemyHp <= 0) {
        println("${hero.name} menang! Musuh dikalahkan!")
    } else {
        println("Pertempuran berakhir tanpa pemenang.")
    }

    scanner.close()
}