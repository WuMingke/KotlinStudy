package project6

/**
 * Create by wuqinglie on 2019/10/30 17:24
 */
data class User(
    var id: Int,
    var name: String,
    var playerViewType: PlayerViewType = PlayerViewType.VIP("qinglie","qinglie")
)