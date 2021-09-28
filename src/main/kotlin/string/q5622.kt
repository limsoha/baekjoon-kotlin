package string

fun dial(str: String): String {
    val array = arrayOf("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ")

    var time = 0
    str.forEach { c->
        time += array.indexOfFirst { it.contains(c) } + 3
    }

    return time.toString()
}