package oop_72495_nadhilacitra.week11

fun main() {

    println("=== SMART HOME CONFIGURATION PIPELINE ===")

    // Penampung perangkat
    val homeDevices = mutableListOf<SmartDevice>()

    // Konfigurasi Lampu Pintar
    SmartDevice(
        "Philips WiZ Living Room",
        "Lighting"
    ).apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    // Konfigurasi Kamera
    SmartDevice(
        "Ezviz Outdoor",
        "Camera"
    ).apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    // Konfigurasi AC menggunakan run
    val acDevice = run {
        SmartDevice(
            "Daikin Inverter (Kabel 3x2.5)",
            "HVAC",
            false,
            800
        )
    }

    homeDevices.add(acDevice)

    // Auto feeder
    homeDevices.add(
        SmartDevice(
            "Picolo's Auto Feeder",
            "Pet Care",
            true,
            10
        )
    )

    // Pencarian dengan let
    val searchResult = homeDevices.find {
        it.category == "Camera"
    }

    searchResult?.let {
        println("\n=== HASIL PENCARIAN ===")
        println(it.diagnose())
    }

    // Ringkasan menggunakan with
    with(homeDevices) {

        println("\n=== RINGKASAN DASHBOARD ===")
        println("Jumlah perangkat: ${this.size}")

        forEach {
            println("- ${it.name}")
        }
    }

    // Total daya menggunakan run
    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }

    println("\nTotal penggunaan daya: $totalPower Watt")

    // Cetak seluruh perangkat
    println("\n=== STATUS SELURUH PERANGKAT ===")

    homeDevices.forEach {
        println(it.diagnose())
    }
}