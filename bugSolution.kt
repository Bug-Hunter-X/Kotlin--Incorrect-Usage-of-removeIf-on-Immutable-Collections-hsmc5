```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    val map = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    map.removeIf { it.key > 2 }
    println(map) // Output: {1=one, 2=two}

    // Correct way to handle immutable collections
    val immutableList = listOf(1, 2, 3, 4, 5)
    val filteredList = immutableList.filter { it <= 2 }
    println(filteredList) // Output: [1, 2]

    val immutableSet = setOf(1, 2, 3, 4, 5)
    val filteredSet = immutableSet.filter { it <= 2 }
    println(filteredSet) // Output: [1, 2]

    val immutableMap = mapOf(1 to "one", 2 to "two", 3 to "three")
    val filteredMap = immutableMap.filter { it.key <= 2 }
    println(filteredMap) // Output: {1=one, 2=two}
}
```