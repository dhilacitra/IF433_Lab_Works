package oop_72495_nadhilacitra.week03

fun main(){

    val e = Employee("Budi")
    e.salary = 5000000
    e.increasePerformance()
    e.printStatus()
    println("Pajak: ${e.tax}")
}