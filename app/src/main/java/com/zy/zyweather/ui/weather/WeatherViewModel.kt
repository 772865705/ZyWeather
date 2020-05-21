package com.zy.zyweather.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.zy.zyweather.logic.Repository
import com.zy.zyweather.logic.model.Location

/**
 * Date: 2020/5/21 0021
 * Author: Zhaoyue
 */
class WeatherViewModel : ViewModel() {

    private val locationLiveData =MutableLiveData<Location>()

    var locationLng = ""

    var locationLat = ""

    var placeName = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData) { location ->
        Repository.refreshWeather(location.lng, location.lat)
    }

    fun refreshWeather(lng: String, lat: String) {
        locationLiveData.value = Location(lng, lat)
    }


}