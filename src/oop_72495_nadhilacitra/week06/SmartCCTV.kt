package oop_72495_nadhilacitra.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("$name dinyalakan. Sistem keamanan aktif.")
        startRecord()
    }

    override fun turnOff() {
        println("$name dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("$name mulai merekam aktivitas di sekitarnya.")
    }
}