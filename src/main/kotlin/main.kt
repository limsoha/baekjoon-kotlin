import math.beeHouse
import math.breakEventPoint
import math.findFraction
import math.snail
import string.*
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()
    val token = StringTokenizer(input)

    bw.write(snail(token.nextToken().toInt(), token.nextToken().toInt(), token.nextToken().toInt()))

    br.close()
    bw.flush()
    bw.close()
}

//fun main(args: Array<String>) {
//    print(hansu(10))
//}