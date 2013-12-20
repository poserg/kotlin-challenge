/**
 * Created by sergey on 20/12/13.
 */

import java.util.HashSet
import java.util.ArrayList
import java.util.HashMap

fun main(args: Array<String>) {
    var line = readLine()

    if (line !is String)
        return

    var nm = line!!.split(" ")
    val n = nm.get(0).toInt()
    val m = nm.get(1).toInt()

    val vers: Array<Int?> = arrayOfNulls(m)
    val vers2: Array<Int?> = arrayOfNulls(m)
    val weight: Array<Int?> = arrayOfNulls(m)

    for (i in vers.indices) {
        line = readLine()
        if (line !is String)
            return

        val k = line!!.split(" ")
        vers.set(i, k.get(0).toInt())
        vers2.set(i, k.get(1).toInt())
        weight.set(i, k.get(2).toInt())
    }

    val tops = createModel(n, vers, vers2, weight)
    for (i in tops.indices) {
        getPath(tops, i+1)
    }
}

fun getPath(tops: Array<Top>, index: Int) {
    for (i in tops)
        i.clear()

    tops.get(index - 1).getPath()

    for (i in tops) {
        print (i.weight)
        print (" ")
    }
    print ("\n")
}

fun createModel(n: Int, vers:  Array<Int?>, vers2:  Array<Int?>, weight:  Array<Int?>): Array<Top> {
    val result = Array<Top>(n, {i -> Top(i + 1)})
    for (i in vers.indices) {
        val top = result.get(vers.get(i)!! - 1)
        val otherTop = result.get(vers2.get(i)!! - 1)
        val weight = weight.get(i)

        top.addEdge(otherTop, weight!!)
    }
    return result
}

class Top (val index: Int) {

    val edges = HashSet<Edge>()
    var isWas = false
    var weight: Int = -1

    fun addEdge(otherTop: Top, weight: Int) {
        val edge = Edge(this, otherTop, weight)
        edges.add(edge)
    }

    fun clear() {
        weight = -1
        isWas = false
    }

    fun getPath() {
        if (weight == -1) {
            weight = 0
        }
        isWas = true
        // print("start\nedge.weight = ")
        for (edge in edges.filter { i -> !i.getOtherTop(this).isWas }.sortBy { it.weight }) {
            // print(edge.weight)
            // print("\n")
            val otherTop = edge.getOtherTop(this)
            if (otherTop.weight == -1 || otherTop.weight > weight + edge.weight) {
                otherTop.weight = weight + edge.weight
            }
        }
        for (edge in edges.filter { i -> !i.getOtherTop(this).isWas }.sortBy { it.weight }) {
            edge.getOtherTop(this).getPath()
        }
    }
}

class Edge (val top1: Top, val top2: Top, val weight: Int){
    fun getOtherTop(curTop: Top): Top {
        if (curTop.index == top1.index)
            return top2
        else
            return top1
    }
}