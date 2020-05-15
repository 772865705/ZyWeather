package com.zy.zyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * Date: 2020/5/14 0014
 * Author: Zhaoyue
 */

data class PlaceResponse(val status:String,val query:String,val places:List<Place>)

data class Place(val name:String,val location: Location,
                 @SerializedName("formatted_address") val address:String)

data class Location(val lng:String,val lat:String)
