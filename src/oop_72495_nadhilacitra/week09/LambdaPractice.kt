package oop_72495_nadhilacitra.week09

fun main(){
    println("\n=== TEST LAMBDA ===")
    val sumLambda = {a: Int, b: Int -> a + b }
    println("Hasil Sum: $sumLambda(5, 10)}")

    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")
}