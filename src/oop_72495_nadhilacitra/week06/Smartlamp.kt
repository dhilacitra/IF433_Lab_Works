package oop_72495_nadhilacitra.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name dinyalakan. Lampu sekarang menyala terang.")
    }

    override fun turnOff() {
        println("$name dimatikan. Lampu sekarang padam.")
    }
}