package com.example.cryptouniverse.presentation.coin_list

import com.example.cryptouniverse.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
