package com.example.cryptouniverse.presentation.coin_detail

import com.example.cryptouniverse.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
