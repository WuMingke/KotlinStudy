package project6

import javax.swing.JOptionPane

/**
 * Create by wuqinglie on 2019/10/30 17:51
 */

val TITLE = "player title"
val MESSAGE = "player message"

class VIPPlayer(var title: String?, var message: String?) : PlayerView {

    init {
        println("主构造方法")
        title = title ?: TITLE
        message = message ?: MESSAGE
    }

    constructor() : this(TITLE, MESSAGE) {
        println("无参构造方法")
    }

    constructor(message: String?) : this(TITLE, message) {
        println("一个参数的参构造方法")
    }


    override fun getPlayButton() {
        println("VIP button")

    }

    override fun showView() {
        JOptionPane.showConfirmDialog(null, message, title, JOptionPane.DEFAULT_OPTION)
    }

}