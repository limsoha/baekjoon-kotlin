package string

fun findWord(str: String): String {

    val array = IntArray(26) { -1 }
    str.forEachIndexed { index, c ->
        val charIndex = c.code - 97
        if (array[charIndex] == -1) {
            array[charIndex] = index
        }
    }

    return array.joinToString(separator = "") { "$it " }
}