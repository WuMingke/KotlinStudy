package base

/**
 * Created by qingLie on 2019/10/29.
 */

fun main(args: Array<String>) {


//    println("123")
//    Person("qinglie").printName()

//    val quantity = 5
//    val price: Double = 20.3
//    val base.getName: String = "rice"
//
//    println("price:$price")
//    println("quantity:$quantity")
//    println("product:$base.getName  total:${quantity * price}")


//    fun cases(obj: Any) {
//        when (obj) {
//            1 -> println("1")
//            "hello" -> println("String hello")
//            is Long -> println("is Long")
//            !is Long -> println("is not Long")
//            else -> println("default")
//        }
//    }
//
//    cases(1)
//    println()
//    cases(2L)
//    println()
//    cases("")

//    fun say(str: String): String {
//        return str
//    }
//
//    fun say1(str: String) = str
//
//    println(say1("jack"))
//
//
//    fun say2(str: String = "bob") = str
//
//    println(say2("lucy"))


//    fun hasEmpty(vararg str: String?): Boolean {
//        for (strItem in str) {
//            if ("" == strItem || null == strItem) return true
//        }
//        return false
//    }
//

//    base.StringUtils.isEmpty("")


//    Person().printName()
//    Person().printProgrammer()

//    fun base.Animal.bark() = "animal"
//    fun base.Dog.bark() = "dog"
//
//    fun base.Animal.printBark(anim: base.Animal) {
//        println(anim.bark())
//    }
//
//    base.Animal().printBark(base.Dog())


//    val get = base.Single.get()


//    base.Cat(base.Dog()).bark()

    { x: Int, y: Int ->
        println("${x + y}")
    }(1, 3)

    val printMsg = { msg: String ->
        println(msg)
    }

//    printMsg.invoke("123")
    printMsg("456");
}

interface Animal {
    fun bark()
}


class Dog : Animal {
    override fun bark() {
        println("wang wang")
    }
}

class Cat(animal: Animal) : Animal by animal


//open class base.Animal
//
//class base.Dog : base.Animal()

