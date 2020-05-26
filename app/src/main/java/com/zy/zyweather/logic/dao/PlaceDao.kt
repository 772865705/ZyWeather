package com.zy.zyweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.zy.zyweather.MyApplication
import com.zy.zyweather.logic.model.Place

/**
 * Date: 2020/5/26 0026
 * Author: Zhaoyue
 */
object PlaceDao {

    private const val SP_PLACE = "place"

    private fun sharedPreferences() = MyApplication.context.getSharedPreferences("zy_weather",Context.MODE_PRIVATE)

    fun savePlace(place: Place){
        sharedPreferences().edit(false){
            putString(SP_PLACE,Gson().toJson(place))
        }
    }

    fun getSavedPlace():Place{
        val placeJson = sharedPreferences().getString(SP_PLACE,"")
        return Gson().fromJson(placeJson,Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")
}