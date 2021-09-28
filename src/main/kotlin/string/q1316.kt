package string

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.*

fun groupWord(br: BufferedReader, bw: BufferedWriter) {

    var input = br.readLine()
    var token = StringTokenizer(input)
    val num = token.nextToken().toInt()

    var count = 0

    for (i in 0 until num) {
        val str = StringTokenizer(br.readLine()).nextToken()
        val map = HashMap<Char, Int>()
        for (j in str.indices) {
            if (map.containsKey(str[j]) && map[str[j]] != j - 1) {
                break
            } else {
                map[str[j]] = j
            }

            if (j == str.length - 1) {
                count ++
            }
        }
    }

    bw.write("$count")
}