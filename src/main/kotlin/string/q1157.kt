package string

fun maxRepeat(str: String): String {
    
    val map = HashMap<Char, Int>()

    str.uppercase().forEach {
        map[it] = map.getOrDefault(it, 0) + 1
    }

    val maxEntry = map.maxByOrNull { it.value }
    if (map.values.count { it == maxEntry?.value } > 1) {
        return "?"
    }
    return maxEntry?.key.toString()
}