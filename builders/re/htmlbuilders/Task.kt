package builders.re.htmlbuilders

fun renderProductTable(): String {
    return html {
        table {
            tr(getTitleColor()) {
                td(getTitleColor()) {
                    text("Product")
                }
                td(getTitleColor()) {
                    text("Price")
                }
                td(getTitleColor()) {
                    text("Popularity")
                }
            }
            val products = getProducts()
            products.forEachIndexed { index, product ->
                tr() {
                    td(getCellColor(index, 0)) {
                        text(product.description)
                    }
                    td(getCellColor(index, 1)) {
                        text(product.price)
                    }
                    td(getCellColor(index, 2)) {
                        text(product.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, column: Int) = if ((index + column) % 2 == 0) "#dce4ff" else "#eff2ff"