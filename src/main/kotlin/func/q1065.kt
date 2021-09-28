package func

fun hansu(num: Int): Int {

    if (num < 100) {
        return num
    }

    var count = 99

    for (i in count + 1..num) {
        if (verifyNum(i)) {
            count++
        }
    }

    return count
}

fun verifyNum(num: Int): Boolean {
    val list = num.toString().toList()
    val gap = list[1] - list[0]

    for (i in 1 until list.size - 1) {
        if (list[i + 1] - list[i] != gap) {
            return false
        }
    }

    return true
}