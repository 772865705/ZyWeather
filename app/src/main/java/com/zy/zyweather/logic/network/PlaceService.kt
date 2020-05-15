package com.zy.zyweather.logic.network

import com.zy.zyweather.MyApplication
import com.zy.zyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Date: 2020/5/14 0014
 * Author: Zhaoyue
 */

interface PlaceService {
    @GET("v2/place?token=${MyApplication.TOKEN}&lang=zh_CH")
    fun searchPlaces(@Query("query") query:String): Call<PlaceResponse>
}