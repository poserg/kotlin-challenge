/**
 * Created by sergey on 20/12/13.
 */

fun main(args: Array<String>) {
    var line = readLine()

    if (line !is String)
        return

    var nm = line!!.split(" ")
    val n = nm.get(0).toInt()
    val m = nm.get(1).toInt()

    val vers: Array<Int?> = arrayOfNulls(m)
    val rebra: Array<Int?> = arrayOfNulls(m)
    val weight: Array<Int?> = arrayOfNulls(m)

    for (i in vers.indices) {
        line = readLine()
        if (line !is String)
            return

        val k = line!!.split(" ")
        vers.set(i, k.get(0).toInt())
        rebra.set(i, k.get(1).toInt())
        weight.set(i, k.get(2).toInt())
    }


}