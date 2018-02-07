package com.rmnivnv.cryptomoon.model.network

import com.binarybricks.coinhood.network.models.CryptoCompareHistoricalResponse
import com.google.gson.JsonObject
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by rmnivnv on 11/07/2017.
 */
interface CryptoCompareAPI {

    //    @GET
//    fun getCoinsList(@Url url: String): Single<AllCoinsResponse>
//
    @GET("pricemultifull")
    fun getPrices(@Query("fsyms") fromSymbol: String, @Query("tsyms") toSymbol: String): Single<JsonObject>

    @GET("{period}")
    fun getCryptoHistoricalData(@Path("period") period: String,
                                @Query("fsym") fromCurrencySymbol: String?,
                                @Query("tsym") toCurrencySymbol: String?,
                                @Query("limit") limit: Int,
                                @Query("aggregate") aggregate: Int): Single<CryptoCompareHistoricalResponse>

//    @GET("top/pairs")
//    fun getPairs(@Query("fsym") from: String): Single<JsonObject>
}