package oop_72495_nadhilacitra.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}