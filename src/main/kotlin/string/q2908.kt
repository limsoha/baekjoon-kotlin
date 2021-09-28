package string

import kotlin.math.max

fun sangsu(num1: String, num2: String): String {

    return max(num1.reversed().toInt(), num2.reversed().toInt()).toString()
}