/**
 * Created by sergey on 11.12.13.
 */
import java.util.Scanner
import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.ArrayList

fun main(args: Array<String>) {
    while (true) {
    val s = readLine()
    if (s !is String)
        return

    var c1 = s.toInt()
    val str1 = readLine()
    if (str1 !is String)
        return

    val s2 = readLine()
    if (s2 !is String)
        return

    var c2 = s2.toInt()
    val str2 = readLine()
    if (str2 !is String)
        return

    if (c1 > c2) {
        run(str2, c2, str1)
    } else {
        run(str1, c1, str2)
    }

        print("\n")
    }
}

fun run(str1 : String, c1 : Int, str2 : String) {
    fun getLines(strArr: ArrayList<String>): ArrayList<String> {
        val result = ArrayList<String>()
        var m = strArr[0]
        var k = m.lastIndexOf(" ")
        if (k >= 0) {
            result.add(m.substring(0, k))
            result.add(m.substring(m.indexOf(" ") + 1))

            var i = 1;
            while (i < strArr.size()) {
                m = strArr[i]
                val s = m.substring(m.indexOf(" ") + 1)
                result.add(s)
                i++
            }
        }

        for (i in result)
            print (i + "t\n")
        return result
    }

    var test = ArrayList<String>()
    test.add(str1)
    var c = c1

    while(c > 0) {

        for (t in test) {
            val k = str2.indexOf(t)
            if (k >= 0) {
                print (c)
                print ("\n")
                print (t)
                return
            }
        }

        test = getLines(test)

        c--
    }


    print ("0")
}

