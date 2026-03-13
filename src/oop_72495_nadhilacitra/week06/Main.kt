package oop_72495_nadhilacitra.week06

fun main() {

    // Instansiasi perangkat
    val lamp = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\n=== Mengaktifkan Security Mode ===")
    hub.activateSecurityMode()

    println("\n=== Mematikan Semua Perangkat Switchable ===")
    hub.turnOffAllSwitches()
}