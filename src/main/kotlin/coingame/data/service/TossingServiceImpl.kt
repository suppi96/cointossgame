package coingame.data.service;

import coingame.domain.TossData
import java.lang.IllegalArgumentException
import kotlin.random.Random
class TossingServiceImpl(
    private val random: Random = Random.Default
): TossingService {

    override fun getTossData(numberOfCoins: Int): TossData {
        if(numberOfCoins > 0){
            val list: List<Int> =
                buildList(capacity = numberOfCoins) {
                    repeat(numberOfCoins){
                        add(random.nextInt(from = 1, until = 3))
                    }
                }
            return TossData(list)
        } else {
            throw IllegalArgumentException("Illegal numberOfCoins = $numberOfCoins")
        }
    }




}
