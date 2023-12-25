package classes

import kotlin.math.exp

//public int eval(Expr expr) {
//    if (expr instanceof Num) {
//        return ((Num) expr).getValue();
//    }
//    if (expr instanceof Sum) {
//        Sum sum = (Sum) expr;
//        return eval(sum.getLeft()) + eval(sum.getRight());
//    }
//    throw new IllegalArgumentException("Unknown expression");
//}
//
//fun eval(expr: Expr): Int {
//    when(expr){
//        is Num -> return expr.value
//        is Sum -> return eval(expr.left) + eval(expr.right)
//    }
//    throw IllegalArgumentException("Unknown expression")
//}
//
//interface Expr
//class Num(val value: Int) : Expr
//class Sum(val left: Expr, val right: Expr) : Expr