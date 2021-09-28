package math

import java.math.RoundingMode

fun snail(a: Int, b: Int, v: Int): String {
    val result = (v- b).toBigDecimal().divide((a - b).toBigDecimal(), RoundingMode.CEILING)
    return result.toString()
}