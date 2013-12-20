/**
 * Created by Сергей on 20.12.13.
 */
fun main(args: Array<String>) {
    val line = readLine()
    if (line !is String)
        return

    val n = line.toInt()

    val resheto = getResheto(n)

    var s = 0
    for (i in 0..n/2) {
        if (resheto.get(i) as Boolean) {
            if (resheto.get(n - i) as Boolean)
                s++
        }
    }
    print(s)
}

fun getResheto(n: Int): Array<Boolean?> {
    var resheto: Array<Boolean?> = arrayOfNulls(n)

    for (i in 0..resheto.size - 1)
        resheto.set(i, true)

    if (resheto.size > 0)
        resheto.set(0, false)
    if (resheto.size > 1)
        resheto.set(1, false)

    for (i in 2..resheto.size - 1) {
        if (resheto.get(i) as Boolean) {
            for (j in i*i..n - 1 step i) {
                resheto.set(j, false)
            }
        }
    }

    return resheto
}