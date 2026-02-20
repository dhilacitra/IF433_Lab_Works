package oop_72495_nadhilacitra.week03

fun main(){

    val e = Employee("Budi")

    println("--- Test Validasi Salary ---")
    e.salary = -1000      // Harus print Error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    println()

    println("--- Test Encapsulation ---")
    e.increasePerformance()


    e.printStatus()

    println()

    println("--- Test Computed Property ---")
    println("Pajak yang harus dibayar: ${e.tax}")
}