/**
 * Created by sergey on 11.12.13.
 */
import java.util.Scanner

fun main(args: Array<String>) {
    val s = readLine()
    if (s !is String)
        return

    val p = s.toInt()

    for (i in 1..p) {
        val t = readLine()
        if (t != null) {
            var arr = t.split(" ")
            val n = arr[0].toInt()
            val m = arr[1].toInt()
            val k = arr[2].toInt()

            val max = n - k
            val min = max - m
            print (min)
            print(" ")
            print(max)
        }
    }
}