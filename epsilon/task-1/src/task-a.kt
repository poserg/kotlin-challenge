/**
 * Created by Сергей on 21.12.13.
 */
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var s = scanner.next()
    val a = s.toInt()

    s = scanner.next()
    val b = s.toInt()

    s = scanner.next()
    val c = s.toInt()

    if (a <= b + c)
        print(a)
    else
        print(b+c)
}