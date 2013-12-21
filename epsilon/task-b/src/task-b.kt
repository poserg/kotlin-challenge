/**
 * Created by Сергей on 21.12.13.
 */
fun main(args: Array<String>) {

    val n = 10

    var a = Array(n, {i -> i + 1})
    for (i in 1..n) {
        val t = random.nextInt(i)
        val tmp = a[i - 1]
        a[i - 1] = a[t]
        a[t] = tmp
    }

    print (a)
}
