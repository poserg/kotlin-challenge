/**
 * Created by Сергей on 20.12.13.
 */
fun main(args: Array<String>) {
    val line = readLine()
    if (line !is String)
        return

    var s1 = 0;
    for (i in 0..2)
        s1 += line.get(i).toInt()

    var s2 = 0
    for (i in 3..5)
        s2 += line.get(i).toInt()

    if (s1 == s2)
        print("Lucky ticket")
    else
        print("Unlucky ticket")
}