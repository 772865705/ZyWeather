package com.zy.zyweather.logic

import androidx.lifecycle.liveData
import com.zy.zyweather.logic.model.Place
import com.zy.zyweather.logic.network.NetworkManager
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException

/**
 * Date: 2020/5/14 0014
 * Author: Zhaoyue
 */
object Repository {
    fun searchPlaces(query: String) = liveData(Dispatchers.IO ){

        val result = try {
            val placeResponse = NetworkManager.searchPlaces(query)
            if (placeResponse.status == "ok"){
                val places = placeResponse.places
                Result.success(places)
            }else{
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        }catch (e:Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}