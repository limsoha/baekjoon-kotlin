package math

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.*

fun hotel(br: BufferedReader, bw: BufferedWriter) {

    repeat(br.readLine().toInt()) {

        val line = StringTokenizer(br.readLine())
        val h = line.nextToken().toInt()
        val w = line.nextToken().toInt()
        val n = line.nextToken().toInt()

        val y: Int
        val x: Int
        if (n % h == 0) {
            y = h
            x = n / h
        } else {
            y = n % h
            x = n / h + 1
        }

        bw.write("$y${String.format("%02d", x)}\n")
    }
}