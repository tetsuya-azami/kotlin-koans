package builders.functionliteralswithreceiver

fun task(): List<Boolean> {
    // レシーバーの型を制限できる
    val isEven: Int.() -> Boolean = { this % 2 == 0 }
    val isOdd: Int.() -> Boolean = { !isEven() }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}

fun main() {
    val isThreeMultiple: Int.() -> Boolean = { this % 3 == 0 }
    val isNotThreeMultiple: Int.() -> Boolean = { !isThreeMultiple() }

    println(isThreeMultiple(3))
    println(isThreeMultiple(4))
    println(isNotThreeMultiple(3))
    println(isNotThreeMultiple(4))
}


// 少しLambdaの練習
//fun main() {
//    val func = { e: LocalDateTime -> e.plusDays(1) }
//    // 引数がない時は()をつけない
//    val func2: () -> Int = { -> 1 }
//    // この書き方が良さそう
//    val func3 = { a: Int, b: LocalDateTime, c: String ->
//        println(a)
//        println(b)
//        println(c)
//    }
//    println(func2)
//    println(func2::class)
//    func3(1, LocalDateTime.now(), "hoge")
//    val datePlusedOne = func(LocalDateTime.now())
//    println(datePlusedOne)
//}
