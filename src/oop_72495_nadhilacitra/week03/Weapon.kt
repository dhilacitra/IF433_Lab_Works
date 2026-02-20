package oop_72495_nadhilacitra.week03

class Weapon(val name: String, damageInput: Int) {

    var damage: Int = damageInput
        set(value) {
            when {
                value < 0 -> {
                    println("WARNING: Damage tidak boleh negatif! Nilai tidak diubah.")
                }
                value > 1000 -> {
                    println("WARNING: Damage terlalu besar! Di-set ke maksimum (1000).")
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}