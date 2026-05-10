package oop_72495_nadhilacitra.week10

class WalletRepository<T> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun <R> searchByName(name: String): List<R>
            where R : HasName {

        return items.filter {
            (it as? HasName)?.name?.contains(name, ignoreCase = true) == true
        } as List<R>
    }
}