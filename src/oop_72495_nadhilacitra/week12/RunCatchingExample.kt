package oop_72495_nadhilacitra.week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching{
        "42X".toInt()
    }
}