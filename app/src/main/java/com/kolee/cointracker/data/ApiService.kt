package com.kolee.cointracker.data

import com.kolee.cointracker.core.utils.API_KEY
import com.kolee.cointracker.data.dto.ChartDTO
import com.kolee.cointracker.data.dto.CoinListDTO
import com.kolee.cointracker.data.dto.CoinPriceDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @Headers(API_KEY)
    @GET("top/totalvolfull")
    suspend fun getTopCoins(
        @Query("tsym") toSymbol : String = "USD",
        @Query("limit") limitData : Int = 20
    ) : CoinListDTO

    @Headers(API_KEY)
    @GET("price")
    suspend fun getCoinPriceByName(
        @Query("fsym") fromSymbol : String, // = "BTC",
        @Query("tsyms") toSymbol : String = "USD"
    ) : CoinPriceDTO

    @Headers(API_KEY)
    @GET("{period}")
    fun getChartData(
        @Path("period") period : String,
        @Query("fsym") fromSymbol : String,
        @Query("limit") limit : Int,
        @Query("aggregate") aggregate : Int,
        @Query("tsym") toSymbol : String = "USD"
    ) : Call<ChartDTO>


}