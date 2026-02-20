package oop_72495_nadhilacitra.week03

fun main(){

    val weapon = Weapon("Dragon Slayer", 500)

    weapon.damage = -50
    weapon.damage = 9999

    println("Nama Weapon: ${weapon.name}")
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
}