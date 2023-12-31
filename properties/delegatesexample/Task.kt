package properties.delegatesexample

class LazyProperty(private val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}

fun main() {
    val initializer = {
        println("initializerが呼ばれました。")
        1
    }
    val lazyProperty = LazyProperty(initializer)
    println(lazyProperty.lazyValue)
    println(lazyProperty.lazyValue)
}