package oop_72495_nadhilacitra.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, 8.7, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 25, -12.4, "CLOSED"),
        TradeLog("XRPUSDT", "LONG", 5, 6.3, "OPEN"),
        TradeLog("BNBUSDT", "SHORT", 8, -3.1, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    println()

    println("TOP PERFORMERS:")
    topPerformersString.forEach { println(it) }

    println()
    println("WORST PERFORMERS:")
    worstPerformersString.forEach { println(it) }

    println()
    println("TRADED PAIRS:")
    println(uniquePairs)
}
// Full pipeline tested successfully