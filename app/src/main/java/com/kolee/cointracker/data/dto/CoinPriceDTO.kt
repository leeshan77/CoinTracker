package com.kolee.cointracker.data.dto

import com.google.gson.annotations.SerializedName


data class CoinPriceDTO(
    @SerializedName("USD")
    val usd: Double
)
