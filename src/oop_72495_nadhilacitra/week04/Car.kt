package oop_72495_nadhilacitra.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand){
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}