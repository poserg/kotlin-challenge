/**
 * Created by sergey on 11.12.13.
 */
import java.util.Scanner
import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.ArrayList

fun main(args: Array<String>) {
    val s = readLine()
    if (s !is String)
        return

    var c1 = s.toInt()
    var str1 = readLine()

    val s2 = readLine()
    if (s2 !is String)
        return

    var c2 = s2.toInt()
    var str2 = readLine()

    if (str1 is String) {
        val fds = str1.indexOf(' ')
    }
    print (str1.substr)
//    for (i in 0..p - 1) {
//        val t = readLine()
//        if (t != null) {
//            var arr = t.split(" ")
//            val n = arr[0].toInt()
//            val m = arr[1].toInt()
//            val k = arr[2].toInt()
//
//            var max = n - k
//            var min = max - m
//            str = str.plus(min.toString().plus(" ").plus(max.toString()).plus("\n"))
//        }
//    }
//    print (str.substring(0, str.length - 1))
}

fun getLines(str: String, count: Int) {
    val result = ArrayList<String>()

    return result
}