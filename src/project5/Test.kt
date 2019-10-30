package project5

/**
 * Create by wuqinglie on 2019/10/30 16:39
 */

class Test {
    companion object {

        fun isEmpty(string: String): Boolean {
            return "" == string
        }

        fun isEmpty2(string: String): Boolean {
            return "" == string
        }
    }


}

interface Animal {
    fun bark()
}

class Dog : Animal {
    override fun bark() {
        println("wang")
    }
}

class Zoo(animal: Animal) : Animal by animal

fun main(args: Array<String>) {
    Zoo(Dog()).bark()
}