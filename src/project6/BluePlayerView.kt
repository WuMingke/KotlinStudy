package project6

import javax.swing.JOptionPane

/**
 * Create by wuqinglie on 2019/10/30 17:37
 */
class BluePlayerView : PlayerView {
    override fun getPlayButton() {
        println("blue button")

    }

    override fun showView() {
        JOptionPane.showConfirmDialog(
            null,
            "show blue player",
            "blue player",
            JOptionPane.DEFAULT_OPTION
        )
    }
}