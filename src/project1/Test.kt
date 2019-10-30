//@file:JvmName("my")

package project1

import java.io.File



/**
 * Create by wuqinglie on 2019/10/30 14:11
 */

fun main(args: Array<String>) {

//    A.a.testNum(1)

//    val clazz = A.a.javaClass

//    val age = 18

//    val name = "qinglie"

//    println()

//    function()

    val file: File? = null
    file?.readText()

}


fun function() {
    val string = "hello world"

    //函数嵌套，用途：在某些情况下触发递归的函数/不希望被外部函数访问到的函数
    fun say(count: Int = 10) {
        println(string)
        if (count > 0) {
            say(count - 1)
        }
    }

    say(3)
}