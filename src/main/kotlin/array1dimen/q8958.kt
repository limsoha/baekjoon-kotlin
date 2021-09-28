package array1dimen

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.*

fun overAvg(br: BufferedReader, bw: BufferedWriter) {

    var input = br.readLine()
    var token = StringTokenizer(input)
    val case = token.nextToken().toInt()

    for (i in 0 until case) {
        input = br.readLine()
        token = StringTokenizer(input)
        val num = token.nextToken().toInt()
        var sum = 0
        val array = arrayListOf<Int>()
        for (j in 0 until num) {
            val score = token.nextToken().toInt()
            sum += score
            array.add(score)
        }
        val avg = sum.toFloat() / num
        val percentage = String.format("%.3f", array.count { it > avg }.toFloat() / num * 100)

        bw.write("$percentage%\n")
    }
}