package project7

/**
 * Create by wuqinglie on 2019/10/31 11:43
 */
class User(var age: Int, var name: String) {
    operator fun component1() = age
    operator fun component2() = name
}

fun main(args: Array<String>) {
    val user = User(12, "qinglie")

    //解构:
    val (age, name) = user

    println(age)
    println(name)

    for (i in 1..10) {

    }

    for (i in 1 until 10) {

    }

    for (i in 10 downTo 1) {

    }

    for (i in 1..10 step 2) {

    }

    repeat(10) {

    }

    val list = arrayListOf('a', 'b', 'c', 'd')

   // list.map { it - 'a' }.filter { it>0 }.find {  }

}