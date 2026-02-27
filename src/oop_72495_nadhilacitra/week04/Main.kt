package oop_72495_nadhilacitra.week04

fun main() {

    println("---Testing Vehicle---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n---Testing Car---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n---Testing Electric Car---")
    val myElectricCar = ElectricCar(
        brand = "Tesla",
        numberOfDoors = 4,
        batteryCapacity = 85
    )
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()

    // ===============================
    // TESTING EMPLOYEE HIERARCHY
    // ===============================

    println("\n---Testing Employee Hierarchy---")

    val manager = Manager(
        name = "Budi",
        baseSalary = 15_000_000
    )

    val developer = Developer(
        name = "Sinta",
        baseSalary = 10_000_000,
        programmingLanguage = "Kotlin"
    )

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println()

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}