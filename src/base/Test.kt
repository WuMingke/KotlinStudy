package base

/**
 * Create by wuqinglie on 2019/10/30 11:48
 */

var name: String = "wuqinglie"

var name2: String? = null

fun main(args: Array<String>) {
//    base.getName2 = base.getName
//    base.getName = base.getName2!!//强转，确定name2已经不为null了
//    base.printStr("123")
//    base.testClass(base.ImportKT::class.java)
    printStr(ImportKT.`in`)
}

fun printStr(string: String): String {

    println("Sting:$string")
    return string
}


fun testClass(clazz: Class<ImportKT>) {
    printStr(clazz.simpleName)
}
