package oop_72495_nadhilacitra.week12

class InsufficentFundsExceptions(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")