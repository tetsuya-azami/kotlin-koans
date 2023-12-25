package classes

fun eval(expr: Expr): Int {
    when(expr){
        is Num -> return expr.value
        is Sum -> return eval(expr.left) + eval(expr.right)
    }
}

sealed interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr