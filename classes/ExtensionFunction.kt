package classes

import kotlin.math.absoluteValue

fun Int.r(): RationalNumber = RationalNumber(this.absoluteValue, 1)

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first, this.second);

data class RationalNumber(val numerator: Int, val denominator: Int)