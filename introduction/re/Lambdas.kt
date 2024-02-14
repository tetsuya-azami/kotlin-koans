package introduction.re

fun containsEven(collection: Collection<Int>): Boolean =
    collection.any { it % 2 == 0}

fun main() {
    val containsEvenList = listOf(1, 2, 3, 4, 5, 6)
    val notContainsEvenList = listOf(1, 3, 5, 7, 9)
    println(containsEven(containsEvenList))
    println(containsEven(notContainsEvenList))
}