package com.example.cryptouniverse.domain.repository

import com.example.cryptouniverse.data.remote.dto.CoinDetailDto
import com.example.cryptouniverse.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId : String) : CoinDetailDto
}