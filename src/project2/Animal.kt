package project2

/**
 * Create by wuqinglie on 2019/10/30 15:00
 */

open class Animal

class Dog : Animal()

val Animal.type: String
    get() = "lion"

fun Animal.name() = "Animal"
fun Dog.name() = "Dog"

fun Animal.printName(animal: Animal) {
    println(animal.name())
}

fun main(args: Array<String>) {
    //Dog().printName(Dog())
    println(Dog().type)
}