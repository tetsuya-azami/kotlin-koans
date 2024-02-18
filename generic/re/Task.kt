package generic.re

//
//fun <T> Collection<T>.partitionTo(
//    collection1: Collection<T>,
//    collection2: Collection<T>,
//    predicate: (T) -> Boolean
//): Pair<Collection<T>, Collection<T>> {
//    val (collection1TruePart, collection1FalsePart) = collection1.partition { predicate.invoke(it) }
//    val (collection2TruePart, collection2FalsePart) = collection2.partition { predicate.invoke(it) }
//
//    val truePart = collection1TruePart.union(collection2TruePart)
//    val falsePart = collection1FalsePart.union(collection2FalsePart)
//
//    return Pair(truePart, falsePart)
//}

fun <T> Collection<T>.partitionTo(
    first: MutableCollection<T>,
    second: MutableCollection<T>,
    predicate: (T) -> Boolean
): Pair<Collection<T>, Collection<T>> {
    for (element in this) {
        if (predicate.invoke(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }

    return Pair(first, second)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e")
        .partitionTo(ArrayList(), ArrayList()) { s -> !s.contains(" ") }
    check(words == listOf("a", "c"))
    check(lines == listOf("a b", "d e"))
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}')
        .partitionTo(HashSet(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    check(letters == setOf('a', 'r'))
    check(other == setOf('%', '}'))
}

fun main() {
    partitionWordsAndLines()
    partitionLettersAndOtherSymbols()
}