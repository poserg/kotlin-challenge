/**
 * Created by sergey on 23.11.13.
 */

import java.util.Scanner

fun main(args: Array<String>) {
    val line = readLine()
    if (line !is String)
        return

    var index = line.indexOf(" ")
    print(line.substring(0, index).toInt() + line.substring(index + 1, line.size).toInt())
}