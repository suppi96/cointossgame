package coingame.domain;

class TossData (
        val values: List<Int>
){
    val total: Int = values.sum()

    val numberOfCoins: Int = values.size

    override fun toString(): String{
        return "TossData(values=$values, total=$total, numberOfCoins=$numberOfCoins)"
    }

}
