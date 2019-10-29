/**
 * Created on 2019/10/29.
 */

class Single private constructor() {

    companion object {
        fun get(): Single {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = Single()
    }
}