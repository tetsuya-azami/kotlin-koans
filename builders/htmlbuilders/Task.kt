package builders.htmlbuilders

fun renderProductTable(): String {
    return html {
        table {
            println("table: $this")
            tr(getTitleColor()) {
                td(getCellColor(0, 0)) {
                    text("Product")
                }
                td(getCellColor(0, 1)) {
                    text("Price")
                }
                td(getCellColor(0, 2)) {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for (product in products.withIndex()) {
                tr {
                    this.td(getCellColor(product.index, 0)) {
                        this.text(product.value.description)
                    }
                    this.td(getCellColor(product.index, 1)) {
                        this.text(product.value.price)
                    }
                    this.td(getCellColor(product.index, 2)) {
                        this.text(product.value.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, column: Int) = if ((index + column) % 2 == 0) "#dce4ff" else "#eff2ff"