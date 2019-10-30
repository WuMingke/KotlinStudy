package project3

/**
 * Create by wuqinglie on 2019/10/30 15:28
 */

fun main(args: Array<String>) {

    val thread: Thread = Thread {}

    //Lambda闭包声明
    val echo = { myName: String -> println(myName) }

    echo.invoke("123")
    echo("456")
}
