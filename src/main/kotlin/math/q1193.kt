package math

fun findFraction(num: Int): String {
    var n = 0
    var sum = 0
    while (sum < num) {
        n++
        sum += n
    }

    val i = sum - num
    return if (n % 2 == 0) "${n - i}/${i + 1}" else "${i + 1}/${n - i}"
}