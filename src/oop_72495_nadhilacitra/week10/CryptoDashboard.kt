package oop_72495_nadhilacitra.week10

fun main() {

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 5.75))
    coinRepo.add(Coin("USDT", 1000.0))

    val response =
        ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")

    response.data.forEach {
        println("Coin: ${it.name}")
        println("Balance: ${it.balance}")
        println("-------------------")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 250.0))
    txRepo.add(Transaction("TX002", 500.0))
    txRepo.add(Transaction("TX003", 1000.0))

    println("\n=== Transactions ===")

    txRepo.getAll().forEach {
        println("Transaction ID: ${it.id}")
        println("Amount: ${it.amount}")
        println("-------------------")
    }
}