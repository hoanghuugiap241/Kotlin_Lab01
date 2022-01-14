package Homework01

import java.util.*
import kotlin.random.Random as Random1

/**
 * Homework01
 * Lab01
 * Created by 19127640 - Hoang Huu Giap
 * Date 1/14/2022 - 11:20 PM
 * Description: ...
 */
class StringExercise {
    fun getStringLength(s: String): Int {
        return s.length
    }
    fun concateString(s1: String, s2: String): String{
        return s1.plus(s2)
    }
    fun getUpperCase(s: String): String{
        return s.uppercase()
    }
    fun findAndReplace(s1: String, s2: String):String{
        return s1.replace(s2, "nlhdung", true)
    }
    fun findAndRemove(s1: String, s2: String):String{
        var result: String = ""
        var originalString: String = s1
        var newPos: Int = 0
        var oldPos: Int = 0
        var found: Int = originalString.indexOf(s2)
        while (true){
            if (found == -1){
                result += originalString.substring(oldPos)
                break
            }
            result += originalString.substring(oldPos, found)
            newPos = found + s2.length
            originalString = originalString.substring(newPos)
            found = originalString.indexOf(s2)
        }
        return result
    }
    fun addHead(s: String):String{
        return s.prependIndent("nlhdung")
    }
    fun addTail(s: String):String{
        return s.plus("nlhdung")
    }
    fun insertToPosition(s: String, x: Int):String{
        if (x > s.length)
            return "Can't insert at position $x"
        return s.substring(0, x) + "nlhdung" + s.substring(x)
    }
    fun calculateNumberOfElement(s: String):Int{
        var count: Int = 0
        var position: Int = -1
        var value: String = s
        position = value.indexOf("nlhdung")
        while (position != -1){
            count++
            value = value.substring(position + "nlhdung".length)
            position = value.indexOf("nlhdung")
        }
        return count
    }
    fun randomString(s: String):String{
        val random = Random()
        var startIndex: Int = random.nextInt(s.length/2)
        var endIndex: Int = startIndex + s.length/2
        return s.substring(startIndex, endIndex)
    }
}

fun main(args: Array<String>) {
    var stringExercise = StringExercise()
    println(stringExercise.getStringLength("nlhdung"))
    println(stringExercise.concateString("nlhdung", "123"))
    println(stringExercise.getUpperCase("nlhdung"))
    println(stringExercise.findAndReplace("Dai Hoc Khoa Hoc Tu Nhien", "hoc"))
    println(stringExercise.findAndRemove("nlhdungnlhdungnlhdungHonlhdungannlhdungg nlhdungHunlhdungu Giapnlhdungnlhdungnlhdungnlhdungnlhdungnlhdung", "nlhdung"))
    println(stringExercise.addHead("123"))
    println(stringExercise.addTail("Teacher: "))
    println(stringExercise.insertToPosition("Teacher of me", 8))
    println(stringExercise.calculateNumberOfElement("nlhdungnlhdungnlhdungHonlhdungannlhdungg nlhdungHunlhdungu Giapnlhdungnlhdungnlhdungnlhdungnlhdungnlhdung"))
    println(stringExercise.randomString("Hoang Huu Giap"))
}