package oop_72495_nadhilacitra.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name dinyalakan. Smart speaker siap digunakan.")
    }

    override fun turnOff() {
        println("$name dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}