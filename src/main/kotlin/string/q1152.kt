package string

fun countWord(str: String): String {
    val trimed = str.trim()
    return if (trimed.isEmpty()) {
        "0"
    } else {
        (trimed.split(" ").size).toString()
    }
}