package builders.stringandmapbuilders

// 生成ロジックを引数で受け取るHashMapのbuilder的関数
fun <K, V> buildMutableMap(build: HashMap<K, V>.() -> Unit): HashMap<K, V> {
    val map = HashMap<K, V>()
    // 生成ロジックを実行
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMutableMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}


fun main() {
    // 生成ロジックをbuildMutableMapの引数に渡す
    val map1 = buildMutableMap {
        put(1, 2)
    }
    // 生成ロジックをbuildMutableMapの引数に渡す
    val map2 = buildMutableMap {
        put(3, 4)
    }

    println(map1)
    println(map2)
}