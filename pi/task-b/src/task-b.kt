/**
 * Created by sergey on 11.12.13.
 */
import java.util.Scanner

fun main(args: Array<String>) {
    val s = readLine()
    if (s !is String)
        return

    val p = s.toInt()
    var str = ""
    for (i in 0..p - 1) {
        val t = readLine()
        if (t != null) {
            var arr = t.split(" ")
            val n = arr[0].toInt()
            val m = arr[1].toInt()
            val k = arr[2].toInt()

            var max = n - k
            var min = max - m
            str = str.plus(min.toString().plus(" ").plus(max.toString()).plus("\n"))
        }
    }
    print (str.substring(0, str.length - 1))
}