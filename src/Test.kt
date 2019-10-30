/**
 * Create by wuqinglie on 2019/10/30 11:48
 */

var name: String = "wuqinglie"

var name2: String? = null

fun main(args: Array<String>) {
//    name2 = name
//    name = name2!!//强转，确定name2已经不为null了
    printStr("123")
}

fun printStr(string: String): String {

    println("Sting:$string")
    return string
}
