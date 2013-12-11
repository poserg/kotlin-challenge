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
        val p2 = readLine()
        if (p2 is String) {
            val p2i = p2.toInt()
            val t = readLine()
            var total = 0
            if (t != null) {
                var arr = t.split(" ")
                for (j in p2i + 1 downTo 1) {
                    var cur = 0
                    for (f in 0..p2i - 1) {
                        if (j - arr[f].toInt() == f + 1) {
                            cur+=1
                        }
                    }
                    if (cur > total)
                        total = cur
                    if (total == j - 1)
                        break
        }
                str = str.plus(total).plus("\n")
        }
    }
    }
    print (str.substring(0, str.length - 1))
}