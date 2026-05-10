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
}