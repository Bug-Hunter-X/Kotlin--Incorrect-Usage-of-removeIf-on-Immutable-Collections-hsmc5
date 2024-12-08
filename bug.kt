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

    // Incorrect usage of removeIf on immutable collections
    val immutableList = listOf(1, 2, 3, 4, 5)
    // immutableList.removeIf { it > 2 } // This will cause a compile-time error
    val immutableSet = setOf(1, 2, 3, 4, 5)
    // immutableSet.removeIf { it > 2 } // This will cause a compile-time error
    val immutableMap = mapOf(1 to "one", 2 to "two", 3 to "three")
    // immutableMap.removeIf { it.key > 2 } // This will cause a compile-time error
}
```