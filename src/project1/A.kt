package project1

/**
 * Create by wuqinglie on 2019/10/30 14:10
 */
class A : AInterface {

    override fun testNum(number: Int) {
        println("int")
    }

    companion object {

        var a = A()
    }
}
