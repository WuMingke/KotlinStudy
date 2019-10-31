package project6

import javax.swing.JOptionPane

class GreenPlayerView : PlayerView {
    override fun getPlayButton() {
        println("green button")

    }

    override fun showView() {
        JOptionPane.showConfirmDialog(
            null,
            "show green player",
            "green player",
            JOptionPane.DEFAULT_OPTION
        )
    }

}
