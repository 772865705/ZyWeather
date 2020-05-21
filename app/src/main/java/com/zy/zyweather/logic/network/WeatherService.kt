package com.zy.zyweather.logic.network

import com.zy.zyweather.MyApplication
import com.zy.zyweather.logic.model.DailyResponse
import com.zy.zyweather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Date: 2020/5/21 0021
 * Author: Zhaoyue
 */
interface WeatherService {

    @GET("v2.5/${MyApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng:String,@Path("lat") lat:String):Call<RealtimeResponse>

    @GET("v2.5/${MyApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>
}