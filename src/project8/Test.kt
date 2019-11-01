package project8

/**
 * Create by wuqinglie on 2019/11/1 10:02
 */
data class User(var name: String?)

fun main(args: Array<String>) {

    val user = User("qinglie")

    val let = user.let { user: User -> "let::${user.javaClass}" }
    println(let)

    val run = user.run { "run::${this.javaClass}" }
    println(run)




}