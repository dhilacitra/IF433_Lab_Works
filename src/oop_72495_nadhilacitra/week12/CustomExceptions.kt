package oop_72495_nadhilacitra.week12

class InsufficientFundsExceptions(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")

class BankAccount(var balance: Double){
    fun withdraw(amount: Double){
        if (amount < 0){
            throw IllegalArgumentException("Amount must be positive")
        }
        if (amount > balance){
            throw InsufficientFundsExceptions(amount, balance)
        }
        balance -= amount
        println("Withdrawal successful. Remaining balance: $balance")
    }
}