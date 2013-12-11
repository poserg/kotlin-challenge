/**
 * Created by sergey on 11.12.13.
 */

fun main(args: Array<String>) {
    val line = readLine()

    if (line !is String) {
        return
    }

    var result = -48*line.length
    for (i in 0..(line.length - 1)) {
        result += line.get(i).toInt()
    }

    val med = line.length/2.0
    if (result > med)
        print("ONE")
    else if (result < med)
        print ("ZERO")
    else
        print("EQUAL")
}