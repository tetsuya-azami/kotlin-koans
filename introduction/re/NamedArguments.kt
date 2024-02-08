package introduction.re

fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[", separator = ", ", postfix = "]")
fun main() {
    println(joinOptions(listOf("a", "b", "c")))
}