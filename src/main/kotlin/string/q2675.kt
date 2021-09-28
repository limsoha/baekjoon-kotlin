package string

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.*

fun repeat(br: BufferedReader, bw: BufferedWriter) {

    var input = br.readLine()
    var token = StringTokenizer(input)
    val case = token.nextToken().toInt()

    for (i in 0 until case) {
        input = br.readLine()
        token = StringTokenizer(input)
        val times = token.nextToken().toInt()
        val ori = token.nextToken()
        val result = ori.map { it.toString().repeat(times) }.joinToString(separator = "") { it }
        bw.write("$result\n")
    }
}