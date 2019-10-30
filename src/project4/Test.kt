package project4

/**
 * Create by wuqinglie on 2019/10/30 16:12
 *
 * 高阶函数
 */
inline fun onlyIf(debug: Boolean, block: () -> Unit) {
    if (debug) block()
}

fun main(args: Array<String>) {
    onlyIf(true) {
        println("log...log")
    }
}