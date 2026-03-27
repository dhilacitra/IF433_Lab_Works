package oop_72495_nadhilacitra.week07

fun processEvent(event: BattleState) {
    when (event) {

        is BattleState.MonsterEncounter -> {
            println("⚔️ Monster muncul: ${event.monsterName}! Bersiap bertarung!")
        }

        is BattleState.LootDropped -> {
            val (name, _, rarity) = event.item
            println("🎁 Kamu mendapatkan loot: $name [$rarity]")
        }

        is BattleState.GameOver -> {
            println("💀 Game Over! Alasan: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("🛡️ Kamu berada di Safe Zone. Istirahat dulu...")
        }
    }
}