package oop_72495_nadhilacitra.week11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)