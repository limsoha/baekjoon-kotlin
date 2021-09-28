package string

fun sum(str: String): String {
    return str.fold(0) { acc, c -> acc + c.digitToInt() }.toString()
}