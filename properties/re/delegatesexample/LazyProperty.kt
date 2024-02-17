package properties.re.delegatesexample

class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}