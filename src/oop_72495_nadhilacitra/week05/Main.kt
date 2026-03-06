package oop_72495_nadhilacitra.week05

fun main() {

    val eWallet = EWallet("Budi", 50000.0)
    val creditCard = CreditCard("Andi", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (method in paymentMethods) {
        println("Memproses pembayaran untuk ${method.accountName}")

        method.processPayment(75000.0)

        if (method is EWallet) {
            println("Saldo EWallet kurang, melakukan top up otomatis...")
            method.topUp(50000.0)

            println("Mencoba transaksi lagi...")
            method.processPayment(75000.0)
        }

        println()
    }
}