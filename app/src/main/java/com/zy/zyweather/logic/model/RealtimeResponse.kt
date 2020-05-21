package com.zy.zyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * Date: 2020/5/21 0021
 * Author: Zhaoyue
 */
data class RealtimeResponse(val status:String,val result: Result){

    data class Result(val realtime: Realtime)

    data class Realtime(val skycon:String,val temperature:Float,
                        @SerializedName("air_quality") val airQuality:AirQuality)

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn:Float)

}
