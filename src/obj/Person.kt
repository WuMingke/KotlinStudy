package obj

/**
 * Created by qinglie on 2019/10/29.
 */

class Person(private var name: String = "unknow") {

    private var info: String? = null

    val sex: String? = null

    init {
        name = "qinglie"
    }

    fun printName() {
        println(name)
    }

    constructor(name: String, info: String) : this(name) {
        this.info = info
    }

    fun printProgrammer(): Unit {
        println(Programmer.JAVA)
    }

    

}

enum class Programmer {
    JAVA, KOTLIN, C
}