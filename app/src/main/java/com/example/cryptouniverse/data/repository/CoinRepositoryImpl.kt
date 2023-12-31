package com.example.cryptouniverse.data.repository

import com.example.cryptouniverse.data.remote.CoinPaprikaApi
import com.example.cryptouniverse.data.remote.dto.CoinDetailDto
import com.example.cryptouniverse.data.remote.dto.CoinDto
import com.example.cryptouniverse.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    val api : CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoin(coinId)
    }
}