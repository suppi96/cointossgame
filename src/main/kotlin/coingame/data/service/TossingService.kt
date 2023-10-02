package coingame.data.service;

import coingame.domain.TossData;
interface TossingService {

    fun getTossData(numberOfCoins: Int): TossData

}
