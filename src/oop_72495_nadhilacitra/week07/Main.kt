package oop_72495_nadhilacitra.week07

fun main() {
    val client = NetworkClient.create("https://api.umn.ac.id")
    client.request("users")
}