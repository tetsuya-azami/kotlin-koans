package properties.re.lazyproperty

class LazyProperty(val initializer: () -> Int) {
    private var reallyLazy: Int? = null
    val lazy: Int
        get() {
            if (reallyLazy == null) reallyLazy = initializer()
            return reallyLazy!!
        }
}