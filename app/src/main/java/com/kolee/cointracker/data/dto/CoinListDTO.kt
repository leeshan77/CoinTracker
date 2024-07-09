package com.kolee.cointracker.data.dto

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

data class CoinListDTO(
    @SerializedName("Data")
    val data: List<Data>
) {
    @Parcelize
    data class Data(
        @SerializedName("CoinInfo")
        val coinInfo: CoinInfo,
        @SerializedName("DISPLAY")
        val display: DISPLAY,
        @SerializedName("RAW")
        val raw: RAW
    ) : Parcelable {

        @Parcelize
        data class CoinInfo(
            @SerializedName("Algorithm")
            val algorithm: String,
            @SerializedName("FullName")
            val fullName: String,
            @SerializedName("Id")
            val id: String,
            @SerializedName("ImageUrl")
            val imageUrl: String,
            @SerializedName("Name")
            val name: String,
        ) : Parcelable

        @Parcelize
        data class DISPLAY(
            @SerializedName("USD")
            val usd: USD
        ) : Parcelable {
            @Parcelize
            data class USD(
                @SerializedName("CHANGE24HOUR")
                val change24hour: String,
                @SerializedName("CHANGEPCT24HOUR")
                val changePct24hour: String,
                @SerializedName("HIGH24HOUR")
                val hIGH24hour: String,
                @SerializedName("LOW24HOUR")
                val low24hour: String,
                @SerializedName("MKTCAP")
                val mktCap: String,
                @SerializedName("OPEN24HOUR")
                val open24hour: String,
                @SerializedName("PRICE")
                val price: String,
                @SerializedName("SUPPLY")
                val supply: String,
                @SerializedName("TOTALVOLUME24H")
                val totalVolume24h: String
            ): Parcelable
        }

        @Parcelize
        data class RAW(
            @SerializedName("USD")
            val usd: USD
        ) : Parcelable {
            @Parcelize
            data class USD(
                @SerializedName("CHANGEPCT24HOUR")
                val changePCT24hour: Double,
            ): Parcelable
        }
    }
}
