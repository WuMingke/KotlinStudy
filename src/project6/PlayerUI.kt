package project6


/**
 * Create by wuqinglie on 2019/10/30 17:30
 */

class PlayerUI private constructor() {
    companion object {
        fun getPlayerUI(): PlayerUI {
            return Holder.instance
        }
    }

    private object Holder {
        var instance = PlayerUI()
    }

    fun showPlayer(user: User) {
        MediaPlayerView(getPlayerView(user.playerViewType)).showView()
    }
}