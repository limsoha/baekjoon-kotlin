package func

fun selfNum() {

    for (i in 1..10000) {
        if (findMaker(i) == 0) {
            println("$i")
        }
    }
}

fun findMaker(num: Int): Int {

    var maker = 0

    for (i in num downTo 1) {
        val maked = i.toString().fold(0) { sum, c -> sum + c.digitToInt() } + i
        if (num == maked) {
            maker = i
            break
        }
    }

    return maker
}